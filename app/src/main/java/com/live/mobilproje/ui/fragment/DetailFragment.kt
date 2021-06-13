package com.live.mobilproje.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.live.mobilproje.R
import com.live.mobilproje.data.model.User
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_detail.*

class DetailFragment : Fragment() {

    private val args: DetailFragmentArgs by navArgs()
    private lateinit var userItem: User

    private lateinit var avatar: String
    private lateinit var name: String
    private lateinit var email: String
    private lateinit var id: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        userItem = args.userItemDetail
        if (userItem != null) {
            avatar = "https://png.pngtree.com/png-vector/20190710/ourmid/pngtree-user-vector-avatar-png-image_1541962.jpg"
            id = userItem.id
            name = userItem.name
            email = userItem.email
        } else {
            avatar = "https://png.pngtree.com/png-vector/20190710/ourmid/pngtree-user-vector-avatar-png-image_1541962.jpg"
            id = "213213213"
            name = "Burak GÖKÇEN"
            email = "burakgokcen16@gmail.com"
        }

        Glide.with(requireContext()).load(avatar).into(frDetailImageViewProfilePicture)
        frDetailTextViewId.text = id
        frDetailTextViewName.text = name
        frDetailTextViewEmail.text = email

    }

}