package ru.proga.messenger.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.proga.messenger.MainActivity
import ru.proga.messenger.utilits.APP_ACTIVITY


/* Базовый фрагмент, от него наследуются все фрагменты приложения, кроме главного */

open class BaseFragment( layout:Int) : Fragment(layout) {

    override fun onStart() {
        super.onStart()
        APP_ACTIVITY.mAppDrawer.disableDrawer()
    }
}