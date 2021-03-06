package ru.proga.messenger.ui.fragments


import kotlinx.android.synthetic.main.fragment_change_bio.*
import ru.proga.messenger.R
import ru.proga.messenger.utilits.*

/* Фрагмент для изменения информации о пользователе */

class ChangeBioFragment : BaseChangeFragment(R.layout.fragment_change_bio) {

    override fun onResume() {
        super.onResume()
        settings_input_bio.setText(USER.bio)
    }

    override fun change() {
        super.change()
        val newBio = settings_input_bio.text.toString()
        setBioToDatabase(newBio)
    }
}