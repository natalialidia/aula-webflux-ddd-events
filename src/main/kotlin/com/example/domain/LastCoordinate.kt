package com.example.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "lastCoordinate")
data class LastCoordinate(
        @Id
        val _id: String? = null,
        val equipment: Equipment,
        val latitude: Double,
        val longitude: Double,
        val `when`: Date = Date(),
        val routeId: Int
)

fun createLastCoordinate(equipmentId: Int, latitude: Double, longitude: Double, routeId: Int): LastCoordinate {
        val equipment = Equipment(id = equipmentId)
        return LastCoordinate(null, equipment, latitude,longitude, Date(), routeId)
}