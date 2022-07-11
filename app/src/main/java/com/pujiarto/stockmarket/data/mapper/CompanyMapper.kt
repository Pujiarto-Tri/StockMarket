package com.pujiarto.stockmarket.data.mapper

import com.pujiarto.stockmarket.data.local.CompanyListingEntity
import com.pujiarto.stockmarket.data.remote.dto.CompanyInfoDto
import com.pujiarto.stockmarket.domain.model.CompanyInfo
import com.pujiarto.stockmarket.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}