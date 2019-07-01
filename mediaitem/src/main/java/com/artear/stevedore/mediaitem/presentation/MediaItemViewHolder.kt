/*
 * Copyright 2019 Artear S.A.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.artear.stevedore.mediaitem.presentation

import android.net.Uri
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.artear.stevedore.stevedoreitems.presentation.contract.ArtearViewHolder
import com.artear.stevedore.stevedoreitems.presentation.model.ArtearItemDecoration
import com.artear.stevedore.stevedoreitems.repository.model.box.BoxStyle
import kotlinx.android.synthetic.main.mediaitem_view_holder.view.*


class MediaItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        ArtearViewHolder<MediaItemData<BoxStyle>> {

    override fun bind(model: MediaItemData<BoxStyle>, artearItemDecoration: ArtearItemDecoration) {
        itemView.apply {
            mediaItemImage.setImageURI(Uri.parse(model.imageUrl))
            //TODO margin
        }
    }

}