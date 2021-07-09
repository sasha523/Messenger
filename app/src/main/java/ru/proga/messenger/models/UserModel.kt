package ru.proga.messenger.models

data class UserModel(

    val id:String="",
    var username:String="",
    var bio:String="",
    var fullname:String="",
    var state:String="",
    val phone:String="",
    var photoUrl:String="empty"
)
