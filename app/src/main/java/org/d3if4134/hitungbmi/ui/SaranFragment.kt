package org.d3if4134.hitungbmi.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import org.d3if4134.hitungbmi.R
import org.d3if4134.hitungbmi.data.KategoriBmi
import org.d3if4134.hitungbmi.databinding.FragmentSaranBinding


class SaranFragment : Fragment() {
    private lateinit var binding: FragmentSaranBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSaranBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
    private fun updateUI(kategori: KategoriBmi){
        val actionBar = (requireActivity() as AppCompatActivity).supportActionBar
        when (kategori){
            KategoriBmi.KURUS -> {
                actionBar?.title = getString(R.string.Judul_kurus)
                binding.imageView2.setImageResource(R.drawable.kurus)
                binding.textView.text = getString(R.string.saran_kurus)
            }
            KategoriBmi.IDEAL -> {
                actionBar?.title = getString(R.string.Judul_ideal)
                binding.imageView2.setImageResource(R.drawable.ideal)
                binding.textView.text = getString(R.string.saran_ideal)
            }
            KategoriBmi.GEMUK -> {
                actionBar?.title = getString(R.string.Judul_gemuk)
                binding.imageView2.setImageResource(R.drawable.gemuk)
                binding.textView.text = getString(R.string.saran_gemuk)
            }
        }
    }
}