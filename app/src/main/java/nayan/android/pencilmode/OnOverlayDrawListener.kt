package nayan.android.pencilmode

interface OnOverlayDrawListener {
    fun touchPoints(x: Float, y: Float)
    fun closeStroke()
    fun discardStroke()
}
