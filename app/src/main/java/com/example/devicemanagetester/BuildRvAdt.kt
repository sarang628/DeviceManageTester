package com.example.devicemanagetester

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.devicemanagetester.databinding.ItemBuildBinding

class BuildRvAdt : RecyclerView.Adapter<BuildVH>() {
    var buildDataset = ArrayList<BuildData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuildVH {
        val view = ItemBuildBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val viewHolder = BuildVH(view)
        return viewHolder
    }

    override fun onBindViewHolder(holder: BuildVH, position: Int) {
        holder.setData(buildDataset.get(position).title, buildDataset.get(position).value)
    }

    override fun getItemCount(): Int {
        return buildDataset.size
    }

    fun setData(buildDataset: ArrayList<BuildData>) {
        this.buildDataset = buildDataset
        notifyDataSetChanged()
    }

}
