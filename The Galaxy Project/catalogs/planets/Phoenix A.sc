LogLevel 1

Star "Phoenix A*"
{
    ParentBody "Phoenix A* system"
    Class      "X"
    MassSol    1.0e10
    NoPlanets  true

    AccretionDisk
    {
        InnerRadius       592
        OuterRadius       10000
        InnerThickness    12
        OuterThickness    400
        Temperature       78000
        Brightness        1
        Density           4.2467e-10
        DiskNoiseContrast 0.8
        DiskTempContrast  1.0
        Luminosity        7.84e12
        TwistMagn         50
    }

    NoCorona    true
    NoCometTail true
}
