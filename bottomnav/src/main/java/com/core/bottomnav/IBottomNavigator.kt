package com.core.bottomnav


interface IBottomNavigator {

    fun attach(navListener: () -> Unit)
    fun hideNavView()
    fun showNavView(delayed: Boolean)
    fun internetChanged(online: Boolean)
    fun authorized(guest: Boolean)

}