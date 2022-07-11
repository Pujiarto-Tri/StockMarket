package com.pujiarto.stockmarket.di

import com.pujiarto.stockmarket.data.csv.CSVParser
import com.pujiarto.stockmarket.data.csv.CompanyListingsParser
import com.pujiarto.stockmarket.data.csv.IntradayInfoParser
import com.pujiarto.stockmarket.data.repository.StockRepositoryImpl
import com.pujiarto.stockmarket.domain.model.CompanyListing
import com.pujiarto.stockmarket.domain.model.IntradayInfo
import com.pujiarto.stockmarket.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}