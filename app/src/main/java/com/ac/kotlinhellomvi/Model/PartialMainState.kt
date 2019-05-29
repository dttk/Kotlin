package com.ac.kotlinhellomvi.Model

interface PartialMainState {
    class Loading:PartialMainState
    class GotImageLink(var imageLink:String):PartialMainState
    class Error(var error:Throwable):PartialMainState
}