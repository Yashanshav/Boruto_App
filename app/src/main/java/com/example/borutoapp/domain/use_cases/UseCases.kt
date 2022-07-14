package com.example.borutoapp.domain.use_cases

import com.example.borutoapp.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import com.example.borutoapp.domain.use_cases.save_onboarding.SaveOnBoardingUseCase

data class UseCases (
    private val readOnBoardingUseCase: ReadOnBoardingUseCase,
    private val saveOnBoardingUseCase: SaveOnBoardingUseCase
        )