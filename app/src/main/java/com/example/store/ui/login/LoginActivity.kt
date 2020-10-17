package com.example.store.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.store.R
import com.example.store.ui.product.ProductList
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setupListener()
    }

    private fun setupListener() {
        btnLogin.setOnClickListener {
            checkLogin()
        }
    }

    private fun checkLogin() {
        val email1 = "tempuser@gmail.com"
        val password1 = "123456Qwer"

        val email2 = "newmain@mail.ru"
        val password2 = "qwerty"

        val email3 = "admin@admin.kg"
        val password3 = "123456"

        val email4 = "gotoisbad@dd.bb"
        val password4 = "todo123"

        if (
            (email.text.toString() == email1 && password.text.toString() == password1)
            or (email.text.toString() == email2 && password.text.toString() == password2)
            or (email.text.toString() == email3 && password.text.toString() == password3)
            or (email.text.toString() == email4 && password.text.toString() == password4)
        ) startActivity(Intent(applicationContext, ProductList::class.java))
    }
}

