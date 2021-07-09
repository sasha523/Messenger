package ru.proga.messenger.ui.fragments




import androidx.fragment.app.Fragment
import ru.proga.messenger.R
import ru.proga.messenger.utilits.APP_ACTIVITY
import ru.proga.messenger.utilits.hideKeyboard


class MainFragment : Fragment(R.layout.fragment_chats) {


    override fun onResume() {
        super.onResume()
        APP_ACTIVITY.title="Messenger"
        APP_ACTIVITY.mAppDrawer.enableDrawer()
        hideKeyboard()
    }



}