package com.mathewsachin.fategrandautomata.scripts

import com.mathewsachin.libautomata.Region

sealed class SearchVisibleResult {
    object NoFriendsFound : SearchVisibleResult()
    object NotFound : SearchVisibleResult()
    class Found(val support: Region) : SearchVisibleResult()
}