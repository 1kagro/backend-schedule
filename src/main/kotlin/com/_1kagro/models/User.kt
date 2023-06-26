package com._1kagro.models

import kotlinx.serialization.Serializable
import java.sql.Timestamp
@Serializable
data class User (val id: Int, val firstname: String, val second_name: String,
    val lastname: String, val second_lastname: String, val document_type_id: Int,
    val document_number: Int, val email_address: String, val birthday: Timestamp,
    val institution_id: Int, val created_at: Timestamp, val update_at: Timestamp
    )