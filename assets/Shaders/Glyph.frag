//#version 150

uniform sampler2D m_ColorMap;
uniform vec4 m_Color;

uniform vec2 m_Start;
uniform vec2 m_End;

in vec2 texCoord;
in vec3 location;
out vec4 fragColor;

void main() {
    vec4 texColor = m_Color;

    #ifdef HAS_START
        #ifdef HAS_END
        if (location.x < m_Start.x || location.y < m_Start.y || location.x > m_End.x || location.y > m_End.y){
            discard;
            }
        #endif
    #endif
    
    #ifdef HAS_COLORMAP
        texColor = texture2D(m_ColorMap, texCoord);
    #endif

    if (texColor.a < 0.01) discard; // Optimization for transparency
    
    
    // Multiply the texture alpha by the material color alpha
    float finalAlpha = texColor.a * m_Color.a;
    
    // Output the color with the modified alpha
    gl_FragColor = vec4(texColor.rgb * m_Color.rgb, finalAlpha);
}