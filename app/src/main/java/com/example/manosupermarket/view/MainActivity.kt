package com.example.manosupermarket.view

import android.app.PendingIntent.getActivity
import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.example.manosupermarket.databinding.ActivityMainBinding
import com.example.manosupermarket.model.DataModel
import com.example.manosupermarket.network.ApiInterface
import com.example.manosupermarket.network.RetrofitClient
import com.example.manosupermarket.view.adapter.OrderStatusAdapter
import com.example.manosupermarket.view.adapter.OrdersAdapter
import com.example.manosupermarket.viewmodel.MainAcitivityViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var ordersAdapter: OrdersAdapter
    private lateinit var ordersStatusAdapter: OrderStatusAdapter
    private var dataModel: DataModel? = null


    private val viewModel by viewModels<MainAcitivityViewModel> {
        object : ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                return MainAcitivityViewModel() as T
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        getOrdersList()

        binding.bottomLayout.apply {
            homeBt.setOnClickListener {
                showToast("Fragment Home Screen")
            }
            ordersBt.setOnClickListener {
                showToast("Fragment Orders Screen")
            }
            productsBt.setOnClickListener {
                showToast("Fragment Products Screen")
            }
            manageBt.setOnClickListener {
                showToast("Fragment Manage Screen")
            }
            accountBt.setOnClickListener {
                showToast("Fragment Account Screen")
            }
        }

    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        return super.onCreateView(name, context, attrs)
    }


    fun showToast(message: String?) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    fun getOrdersList() {
        var retrofit = RetrofitClient.getInstance()
        var apiInterface = retrofit.create(ApiInterface::class.java)
        lifecycleScope.launchWhenCreated {
            try {
                val response = apiInterface.getOrders()
                if (response.isSuccessful) {
                    dataModel = response.body()

                } else {
                    showToast(response.errorBody().toString())
                }
            } catch (Ex: Exception) {
                Log.e("Error", Ex.localizedMessage)
            }
        }
    }
}