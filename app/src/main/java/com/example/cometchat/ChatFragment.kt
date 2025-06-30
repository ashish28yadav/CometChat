package com.example.cometchat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cometchat.chatuikit.shared.cometchatuikit.CometChatUIKit
import com.cometchat.chatuikit.shared.cometchatuikit.UIKitSettings

class ChatsFragment : Fragment() {
    private lateinit var rootView: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        rootView = inflater.inflate(R.layout.fragment_chat, container, false)

        val conversationsFragment = ConversationsFragment()
        childFragmentManager.beginTransaction()
            .replace(R.id.chats_fragment_container, conversationsFragment)
            .commit()

        return rootView
    }
}
