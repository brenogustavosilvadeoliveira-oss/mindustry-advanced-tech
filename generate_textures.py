#!/usr/bin/env python3
"""
Script para gerar texturas dos minérios e blocos do mod Advanced Tech
Cria imagens PNG automáticas com cores e padrões futuristas
"""

from PIL import Image, ImageDraw, ImageFilter
import os
import random

# Criar diretório de texturas se não existir
os.makedirs("assets/sprites", exist_ok=True)

# Definição dos minérios com cores
ores = {
    "luminite-ore": {"color": (158, 171, 126), "pattern": "dots"},
    "crystalite-ore": {"color": (124, 125, 212), "pattern": "crystal"},
    "xenoith-ore": {"color": (163, 102, 255), "pattern": "spikes"},
    "quantum-ore": {"color": (0, 255, 0), "pattern": "energy"},
    "void-ore": {"color": (26, 26, 46), "pattern": "void"},
    "nexusite-ore": {"color": (255, 107, 157), "pattern": "pulse"},
    "ethereal-ore": {"color": (0, 255, 255), "pattern": "glow"},
    "plasmonite-ore": {"color": (255, 170, 0), "pattern": "plasma"},
    "stellar-ore": {"color": (255, 215, 0), "pattern": "stellar"},
    "cosmic-ore": {"color": (255, 0, 255), "pattern": "cosmic"},
    "arcane-ore": {"color": (0, 212, 255), "pattern": "arcane"},
    "infinity-ore": {"color": (255, 255, 255), "pattern": "infinity"},
}

def create_ore_texture(name, color, pattern):
    """Cria uma textura de minério"""
    size = 32
    img = Image.new('RGBA', (size, size), (0, 0, 0, 0))
    draw = ImageDraw.Draw(img)
    
    # Fundo base cinzento com textura
    for x in range(size):
        for y in range(size):
            noise = random.randint(-20, 20)
            base_color = (60 + noise, 60 + noise, 60 + noise, 255)
            img.putpixel((x, y), base_color)
    
    # Aplicar padrão de cor
    if pattern == "dots":
        for _ in range(15):
            x = random.randint(0, size-1)
            y = random.randint(0, size-1)
            draw.ellipse([x-3, y-3, x+3, y+3], fill=(*color, 200))
    
    elif pattern == "crystal":
        # Cristais em ângulo
        for i in range(5):
            x = random.randint(5, size-5)
            y = random.randint(5, size-5)
            points = [(x, y-4), (x+4, y), (x, y+4), (x-4, y)]
            draw.polygon(points, fill=(*color, 220))
    
    elif pattern == "energy":
        # Padrão de energia
        for i in range(8):
            draw.line([(0, i*4), (size, i*4)], fill=(*color, 150), width=2)
    
    elif pattern == "glow":
        # Efeito de brilho
        for i in range(3):
            draw.ellipse([8+i*2, 8+i*2, 24-i*2, 24-i*2], outline=(*color, 150-i*30), width=1)
    
    # Adicionar brilho
    img.filter(ImageFilter.GaussianBlur(radius=1))
    
    return img

# Gerar texturas
print("Gerando texturas dos minérios...")
for ore_name, ore_props in ores.items():
    texture = create_ore_texture(ore_name, ore_props["color"], ore_props["pattern"])
    texture.save(f"assets/sprites/{ore_name}.png")
    print(f"✓ {ore_name}.png")

print("\n✅ Texturas geradas com sucesso!")
