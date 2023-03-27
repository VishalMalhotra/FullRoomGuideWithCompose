package com.example.roomapp

data class ContactState(
    val contact: List<Contact> = emptyList(),
    val fisrt_name: String = "",
    val last_name: String = "",
    val phoneNumber: String = "",
    val isAddingContact: Boolean = false,
    val sortType: SortType = SortType.FIRST_NAME
)