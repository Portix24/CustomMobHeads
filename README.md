## ⚔️ CustomMobHeads

**CustomMobHeads** is a lightweight and configurable Minecraft plugin that enables custom mob head drops with enhanced control. Perfect for server owners who want personalization without sacrificing performance.

---

### 🧩 Features

- Configurable drop chances through permissions or static values
- Support for custom textures via internal mappings
- Built-in command for head management (`/gethead`)
- Lightweight, performance-friendly event system
- Simple configuration via YML files

---

### 📥 Download

You can download the latest version from [Modrinth](https://modrinth.com/plugin/custom-mob-heads)

> ✅ Minecraft Java Edition **1.21.5+**  
> ✅ Tested on Paper **1.21.7**  
> 🧪 Supports biome-based variants (e.g. cows, pigs, chickens)

---

### ⚙️ Configuration Files

| File                | Description                                                                   |
|---------------------|-------------------------------------------------------------------------------|
| `chance_config.yml` | Controls individual head drop rates for supported mobs                        |
| `sound_config.yml`  | Includes sound overrides for mobs                                             |
| `translations.yml`  | Provides localized names for mob heads (plugin adds `" Head"` automatically)  |
| `textures.yml`      | Maps head identifiers to base64-encoded skin textures                         |

---

### 🔧 Development Notes

- Built using **Maven** and **Java 8**
- Compiled plugin files appear in the `target/` directory after building

---

### 📜 License

This project uses a custom license.  
Please avoid forking or redistributing unless explicitly authorized.

---

### 🤝 Contributions

This plugin is provided as-is and will receive updates only if required for compatibility or major bug fixes.  
Pull requests may be accepted for critical issues, but active development is not guaranteed.  
Feature requests can be submitted via Issues and will be reviewed at the developer’s discretion.

