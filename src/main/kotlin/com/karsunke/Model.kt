import com.fasterxml.jackson.databind.ObjectMapper

data class Model(
    val isActive: Boolean,
    val isAvailable: EmbeddedModel
)

data class EmbeddedModel(
    val value: Boolean,
    val metaData: String
)

fun main() {

    val model = Model(
        isActive = true,
        isAvailable = EmbeddedModel(
            value = true,
            metaData = "someString"
        )
    )

    val objectMapper = ObjectMapper()

    println(objectMapper.writeValueAsString(model))
}
