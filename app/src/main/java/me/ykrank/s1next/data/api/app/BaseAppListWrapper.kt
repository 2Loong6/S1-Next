package me.ykrank.s1next.data.api.app

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by ykrank on 2017/7/22.
 */
open class BaseAppListWrapper<D> : BaseAppResultWrapper<BaseAppList<D>>()

class BaseAppList<D> {
    var pageNo: Int = 0
    var pageSize: Int = 0
    var totalCount: Int = 0
    @JsonProperty("webpageurl")
    var webPageUrl: String? = null
    var list: List<D> = arrayListOf()
}