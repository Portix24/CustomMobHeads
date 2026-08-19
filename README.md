## CustomMobHeads

**CustomMobHeads** is a lightweight and configurable Minecraft plugin that enables custom mob head drops with full control. Perfect for server owners who seek this level of extra immersion.

---

### Features

- **Mob Variant support**  
  This plugin differentiates between different mob variants, as follows:
  - **Temperate / Warm / Cold** Cows, Pigs, and Chickens
  - **Angry / Pollinated / Angry + Pollinated** Bees  
  - **Charged / Normal** Creepers  
  - **Villager Biomes + Professions**  
  - **Tropical Fish** with 22 named special variants (others drop a generic Tropical Fish head, sorry, I ain't adding all 3,072 variants)  
  - Easter egg mobs, like the **Toast Rabbit**, **jeb_ Sheep**, and **The Killer Bunny**

- Built-in command for head management (`/gethead`)  
   - Usage: `/gethead <player> <mob_id> [variant] [subvariant]`
- Support for custom textures via internal mappings
- Lightweight, performance-friendly event system
- Simple configuration via YML files

---

### Configuration Files

| File                | Description                                                                   |
|---------------------|-------------------------------------------------------------------------------|
| `chance_config.yml` | Controls individual head drop rates for mobs                                  |
| `sound_config.yml`  | Includes sound overrides for mobs                                             |
| `translations.yml`  | Provides localized names for mob heads (plugin adds `" Head"` automatically)  |
| `textures.yml`      | Maps head identifiers to base64-encoded skin textures                         |

---

### Download

You can download the latest version from [Modrinth](https://modrinth.com/plugin/custom-mob-heads)

> Minecraft Java Edition **1.21.5+**  
> Tested on Paper **1.21.7**  

---

### License

This project uses the ARR license.
