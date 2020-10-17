package com.example.store.ui.productitem

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import com.example.store.R
import kotlinx.android.synthetic.main.dialog_custom.*

class CustomDialog(context: Context) : Dialog(context) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_custom)
        setupListener()
    }

    private fun setupListener() {
        btnExit.setOnClickListener {
            dismiss()
        }
    }
}