package com.sigiey.womentechstersfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var createNAButton: Button = findViewById(R.id.createNewAccount)
        createNAButton.setOnClickListener {
            var i = Intent(this, CreateNewAccountActivity::class.java)
            startActivity(i)
        }

        val forgotPasswordBtn: Button = findViewById(R.id.forgottenPassword)
        forgotPasswordBtn.setOnClickListener {
            var i = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(i)
        }
        var loginBtn : Button = findViewById(R.id.login)

        var userName : EditText = findViewById(R.id.username)
        var password : EditText = findViewById(R.id.password)

        loginBtn.setOnClickListener{
            val userNameEnter: String = userName.text.toString()
            val userPwdEnter: String = password.text.toString()
            var message = "";

            if ((userNameEnter.isEmpty()) && (userPwdEnter.isEmpty())) {
                message = "Username & password required";
            }else{
                navigateToLoginPage()
            }
            Snackbar
                .make(
                    findViewById(R.id.loginA),
                    message,
                    Snackbar.LENGTH_LONG
                )
                .show()
        }

    }

    private fun navigateToLoginPage() {

        var intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }

}
