package com.example.bottomsheetwithkeyboardexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.EditText
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class MyBottomSheetDialogFragment : BottomSheetDialogFragment() {
    private lateinit var myEditText: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_bottom_sheet_dialog, container, false)
        myEditText = view.findViewById(R.id.my_edit_text)

        return view
    }

    override fun onStart() {
        super.onStart()
        myEditText.requestFocus()
        dialog?.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE)
    }
}
