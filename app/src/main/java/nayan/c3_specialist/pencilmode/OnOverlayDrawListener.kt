package nayan.c3_specialist.pencilmode

interface OnOverlayDrawListener {
    fun touchPoints(x: Float, y: Float)
    fun closeStroke()
    fun discardStroke()
}
