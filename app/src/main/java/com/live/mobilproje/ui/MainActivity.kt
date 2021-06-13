package com.live.mobilproje.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.live.mobilproje.R
import com.live.mobilproje.data.repository.MainRepository
import com.live.mobilproje.ui.base.MainViewModelProviderFactory
import com.live.mobilproje.ui.vm.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setSupportActionBar(ac_ma_toolbar)
        this.window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)

        navController = Navigation.findNavController(this, R.id.ac_ma_nav_host_fragment)
        NavigationUI.setupActionBarWithNavController(this, navController)

        val mainRepository = MainRepository()
        val viewModelProviderFactory = MainViewModelProviderFactory(application, mainRepository)
        mainViewModel = ViewModelProvider(this, viewModelProviderFactory).get(MainViewModel::class.java)
    }

    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this, R.id.ac_ma_nav_host_fragment).navigateUp() || super.onSupportNavigateUp()
    }

    fun showLoading(){
        window.setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE, WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
        ac_main_pb.visibility = View.VISIBLE
    }

    fun hideLoading(){
        window.clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
        ac_main_pb.visibility = View.GONE
    }
}