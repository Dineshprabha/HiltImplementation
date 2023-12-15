package com.dineshprabha.hiltimplementation

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@InstallIn(ActivityComponent::class)
@Module
class UserModule {

    @Provides
    @FirebaseQualifire
    fun provideFirebaseRepository(): UserRepository{
        return FirebaseRepository()
    }

    @Provides
    @Named("sql")
    fun provideUserRepository(sqlRepository: SQLRepository): UserRepository{
        return sqlRepository
    }


    //using binds function

//    @Binds
//    abstract fun provideUserRepository(sqlRepository: SQLRepository): UserRepository
}