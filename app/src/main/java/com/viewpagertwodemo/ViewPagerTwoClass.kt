package com.viewpagertwodemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view_pager_layout.view.*

class ViewPagerTwoClass : RecyclerView.Adapter<PagerVH>() {

    //thelostdevelopers.blogspot.com
    //array of colors to change the background color of screen
    private val colors = intArrayOf(
        android.R.color.black,
        android.R.color.holo_red_light,
        android.R.color.holo_blue_dark,
        android.R.color.holo_purple
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH =
        PagerVH(
            LayoutInflater.from(parent.context).inflate(R.layout.view_pager_layout, parent, false)
        )

    //thelostdevelopers.blogspot.com
    // get the size of color array
    override fun getItemCount(): Int = Int.MAX_VALUE

    //thelostdevelopers.blogspot.com
    //binding the screen with view
    override fun onBindViewHolder(holder: PagerVH, position: Int) = holder.itemView.run {
        if (position == 0) {
            tvTitle.text = "ViewPager1"
            tvAbout.text = "The lost developers fragment 1"
            ivImage.setImageResource(R.drawable.download)
            container.setBackgroundResource(colors[position])
        }
        if (position == 1) {
            tvTitle.text = "ViewPager2"
            tvAbout.text = "The lost developers fragment 2"
            ivImage.setImageResource(R.drawable.images)
            container.setBackgroundResource(colors[position])
        }
        if (position == 2) {
            tvTitle.text = "ViewPager3"
            tvAbout.text = "The lost developers fragment 3"
            ivImage.setImageResource(R.drawable.download)
            container.setBackgroundResource(colors[position])
        }
        if (position == 3) {
            tvTitle.text = "ViewPager4"
            tvAbout.text = "The lost developers fragment 4"
            ivImage.setImageResource(R.drawable.download)
            container.setBackgroundResource(colors[position])
        }
    }
}

class PagerVH(itemView: View) : RecyclerView.ViewHolder(itemView)