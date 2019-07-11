package config


/**
 * Contains configuration app properties.
 */
object Configuration {

    /**
     * the application name.
     */
    const val title = "Tetris"

    /**
     * the application logo.
     */
    const val logo = "icon/logo.png"

    /**
     * the logo for info frame.
     */
    const val infoLogo = "icon/big-logo.png"

    /**
     * the statistic Display height px.
     */
    const val statDisplayHeight = 60

    /**
     *  the game Display height px.
     */
    const val gameDisplayHeight = 400

    /**
     * the Display width px.
     */
    const val displayWidth = 200

    /**
     * the model.Node width/height px.
     */
    const val nodeSize = 20

    /**
     * the number Nodes of horizontally.
     */
    const val height = gameDisplayHeight / nodeSize

    /**
     * the number Nodes of vertically.
     */
    const val width = displayWidth / nodeSize

    /**
     * the file path for game save.
     */
    const val filePath = "C:\\tetris\\game.dat"
}