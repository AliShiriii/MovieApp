package com.example.testapplication.Model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GetContent(
    val AccessLevelTypeID: Int,
    val Authors: String,
    val Categories: List<Category>,
    val CollectionImage: String,
    val CommentCount: Int,
    val ContentID: Int,
    val CreateDate: Int,
    val DisLikeCount: Int,
    val DisLikeStatus: Boolean,
    val Duration: Int,
    val EnglishBody: String,
    val FavoriteStatus: Boolean,
    val LandscapeImage: String,
    val LandscapeImage9X4: String,
    val LikeCount: Int,
    val LikeStatus: Boolean,
    val PortraitImage: String,
    val PortraitImage9X11: String,
    val Price: Double,
    val Properties: List<Property>,
    val PurchasedPrice: Double,
    val SourceSiteLogoUrl: String,
    val SourceSiteTitle: String,
    val SourceSiteWebUrl: String,
    val Summary: String,
    val SupplierID: Int,
    val TagList: List<Tag>,
    val TeacherList: List<String>,
    val ThumbImage: String,
    val Title: String,
    val Type: Int,
    val UpdateDate: Double,
    val ViewCount: Int,
    val ZoneID: Int
): Parcelable