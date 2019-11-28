package co.nayan.c3_specialist.models

import nayan.c3_specialist.pencilmode.models.OverlayData

data class OverlayDataOperation(
    val overlayDataList: MutableList<OverlayData>, val isDeleteOperation: Boolean) {
}