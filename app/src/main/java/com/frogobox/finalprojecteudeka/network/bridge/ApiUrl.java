package com.frogobox.finalprojecteudeka.network.bridge;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * FinalProjectEudeka
 * Copyright (C) 15/03/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Line     : bullbee117
 * Phone    : 081357108568
 * Majors   : D3 Teknik Informatika 2016
 * Campus   : Telkom University
 * -----------------------------------------
 * id.amirisback.frogobox
 */
public class ApiUrl {

    public ApiUrl() {
    }

    public static final class ListApiUrl {


        public static final String API_KEY = "6fb1a8d8-dd31-4592-8ef6-8e35b8a7efdd";
        public static final String HEADER_API_KEY = "x-api-key: " + API_KEY;
        public static final String BASE_URL = "https://api.thecatapi.com";
        // -----------------------------------------------------------------------------------------
        public static final String PREFIX = "/v1";
        public static final String PATH_BREEDS = "/breeds";
        // -----------------------------------------------------------------------------------------
        public static final String URL_BREEDS = PREFIX + PATH_BREEDS;

    }
}