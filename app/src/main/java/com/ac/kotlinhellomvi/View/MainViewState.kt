package com.ac.kotlinhellomvi.View

class MainViewState(internal var isLoading:Boolean,
                    internal var isImageViewShow:Boolean,
                    internal var imageLink:String,
                    internal var error:Throwable?)