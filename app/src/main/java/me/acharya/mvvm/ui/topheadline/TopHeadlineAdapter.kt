package me.acharya.mvvm.ui.topheadline

import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.browser.customtabs.CustomTabsIntent
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.unik.acharyaprashant.data.model.ImageElement
import me.acharya.mvvm.databinding.TopHeadlineItemLayoutBinding


class TopHeadlineAdapter(
    private val articleList: ArrayList<ImageElement>
) : RecyclerView.Adapter<TopHeadlineAdapter.DataViewHolder>() {

    class DataViewHolder(private val binding: TopHeadlineItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(article: ImageElement) {
            val imageURL =
                article.thumbnail.domain + "/" + article.thumbnail.basePath + "/0/" + article.thumbnail.key
            //imageURL = domain + "/" + basePath + "/0/" + key
            Glide.with(binding.imageViewBanner.context)
                .load(imageURL)
                .into(binding.imageViewBanner)
            itemView.setOnClickListener {
                val builder = CustomTabsIntent.Builder()
                val customTabsIntent = builder.build()
                customTabsIntent.launchUrl(it.context, Uri.parse(imageURL))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            TopHeadlineItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun getItemCount(): Int = articleList.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(articleList[position])

    fun addData(list: List<ImageElement>) {
        articleList.addAll(list)
    }

}