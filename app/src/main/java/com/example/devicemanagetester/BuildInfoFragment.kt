package com.example.devicemanagetester

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.devicemanager.DeviceManager
import com.example.devicemanagetester.databinding.FragmentBuildInfoBinding
import com.example.devicemanagetester.databinding.ItemBuildBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BuildInfoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BuildInfoFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_build_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragmentBuildInfoBinding = FragmentBuildInfoBinding.bind(view)
        val deviceManager = DeviceManager()
        fragmentBuildInfoBinding.buildRv.adapter = BuildRvAdt()
        (fragmentBuildInfoBinding.buildRv.adapter as BuildRvAdt).apply {
            setData(ArrayList<BuildData>().apply {
                add(BuildData("Build.USER", Build.USER))
                add(BuildData("Build.DEVICE", Build.DEVICE))
                add(BuildData("Build.BOARD", Build.BOARD))
                add(BuildData("Build.BOOTLOADER", Build.BOOTLOADER))
                add(BuildData("Build.BRAND", Build.BRAND))
                add(BuildData("Build.DISPLAY", Build.DISPLAY))
                add(BuildData("Build.FINGERPRINT", Build.FINGERPRINT))
                add(BuildData("Build.HARDWARE", Build.HARDWARE))
                add(BuildData("Build.HOST", Build.HOST))
                add(BuildData("Build.ID", Build.ID))
                add(BuildData("Build.MANUFACTURER", Build.MANUFACTURER))
                add(BuildData("Build.MODEL", Build.MODEL))
                add(BuildData("Build.PRODUCT", Build.PRODUCT))
                add(BuildData("Build.TAGS", Build.TAGS))
                add(BuildData("Build.TYPE", Build.TYPE))
                add(BuildData("Build.UNKNOWN", Build.UNKNOWN))
                add(BuildData("Build.getRadioVersion", Build.getRadioVersion()))
                //add(BuildData("Build.USER", Build.getSerial()))
                //add(BuildData("Build.USER", Build.Partition.PARTITION_NAME_SYSTEM))
                //add(BuildData("Build.USER", Build.VERSION.BASE_OS))
                add(BuildData("Build.VERSION.CODENAME", Build.VERSION.CODENAME))
                add(BuildData("Build.VERSION.INCREMENTAL", Build.VERSION.INCREMENTAL))
                add(BuildData("Build.VERSION.RELEASE", Build.VERSION.RELEASE))
                //add(BuildData("Build.USER", Build.VERSION.PREVIEW_SDK_INT.toString()))
                add(BuildData("Build.VERSION.SDK_INT", Build.VERSION.SDK_INT.toString()))
            })
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BuildInfoFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BuildInfoFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}