package com.example.motionlayoutplayground.adapters


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.motionlayoutplayground.*


class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var titles = arrayOf("1 - Sliding Box","2 - Color Change","3 - Keyframe Position"
        ,"4 - Keyframe Interpolation", "5 - Keyframe Cycle","6 - Swipe Profile", "7 - Image Detail",
    "8 - Splash Screen")

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var title:TextView

        init {
            title= itemView.findViewById(R.id.title)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.cardview,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.title.text = titles[position]

        holder.itemView.setOnClickListener { v ->
            when(position){
                0 ->{
                    val intent = Intent(v.context,SlideBox::class.java)
                    v.context.startActivity(intent)
                }
                1 ->{
                    val intent = Intent(v.context,ColorChange::class.java)
                    v.context.startActivity(intent)
                }
                2 ->{
                    val intent = Intent(v.context,KeyframePosition::class.java)
                    v.context.startActivity(intent)
                }
                3 ->{
                    val intent = Intent(v.context,KeyframeInterpolation::class.java)
                    v.context.startActivity(intent)
                }
                4 ->{
                    val intent = Intent(v.context,KeyframeCycle::class.java)
                    v.context.startActivity(intent)
                }
                5 ->{
                    val intent = Intent(v.context,SwipeProfile::class.java)
                    v.context.startActivity(intent)
                }
                6 ->{
                    val intent = Intent(v.context,ImageDetail::class.java)
                    v.context.startActivity(intent)
                }
                7 ->{
                    val intent = Intent(v.context,SplashScreen::class.java)
                    v.context.startActivity(intent)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return titles.size
    }


}
