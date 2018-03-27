package br.com.fiap.minhabiblioteca

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Toast
import kotlinx.android.synthetic.main.custom_toast.view.*

/**
 * Created by logonrm on 26/03/2018.
 */

class CustomToast {
    fun showToast(context: Context, mensagem: String) {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val customToastroot = inflater.inflate(R.layout.custom_toast, null)

        val customtoast = Toast(context)

        customtoast.setView(customToastroot)
        val textView = customToastroot.textView1
        textView.setText(mensagem)
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM, 0, 0)
        customtoast.setDuration(Toast.LENGTH_LONG)
        customtoast.show()
    }
}