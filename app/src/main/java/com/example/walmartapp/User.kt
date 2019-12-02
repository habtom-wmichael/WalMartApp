package com.example.walmartapp

import java.io.Serializable

class User : Serializable{
    var firstName: String = ""
    var lastName: String =  ""
    var userName: String = ""
    var password: String = ""

     constructor(fname: String, lName: String, uName: String, uPassword: String ){
        firstName = fname
        lastName = lName
        userName = uName
        password = uPassword
    }
}