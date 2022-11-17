package lol.syntax.scalacord.common.entity

import io.circe.generic.semiauto.*
import io.circe.{Decoder, Encoder}
import lol.syntax.scalacord.common.datatype.*

/** A partial guild object. Represents an Offline Guild, or a Guild whose information has not been
  * provided through Guild Create events during the Gateway connect.
  *
  * @param id
  *   The guild id.
  * @param unavailable
  *   Whether the guild is unavailable. It will be always true.
  */
case class UnavailableGuild(
    id: Snowflake = Snowflake.MinValue,
    unavailable: Boolean = true
)

object UnavailableGuild {
    given encoder: Encoder[UnavailableGuild] = deriveEncoder
    given decoder: Decoder[UnavailableGuild] = deriveDecoder
}
