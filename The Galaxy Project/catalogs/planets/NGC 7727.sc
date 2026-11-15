LogLevel 1

Barycenter "NGC 7727 A* bar"
{
    ParentBody "NGC 7727 system"
}

Barycenter "NGC 7727 B* bar"
{
    ParentBody "NGC 7727 system"

    Orbit
    {
        RefPlane "Extrasolar"
        Period 1.3e8
        SemiMajorAxis 9.5595e8
        Eccentricity 0.85
        Inclination 90
        AscendingNode 332
        ArgOfPericenter 46
        MeanAnomaly 0
    }
}

Star "NGC 7727 A*"
{
    ParentBody "NGC 7727 A* bar"
    Class "X"
    Lum 1e5
    MassSol 1.54e8
    NoPlanets true
    NoAccretionDisk true

    AccretionDisk
    {
        InnerRadius 0
        OuterRadius 0
        InnerThickness 0
        OuterThickness 0
        Temperature 0
        Brightness 0
        Density 0
        DiskNoiseContrast 0
        DiskTempContrast 0
        Luminosity 0
        TwistMagn 0
    }
}

Star "NGC 7727 B*"
{
    ParentBody "NGC 7727 B* bar"
    Class "X"
    Lum 1.17e7
    MassSol 6.33e6
    NoPlanets true

    AccretionDisk
    {
        InnerRadius 0.375
        OuterRadius 20
        InnerThickness 0.08
        OuterThickness 2
        Temperature 50000
        Brightness 0.5
        Density 4.2467e-10
        DiskNoiseContrast 0.8
        DiskTempContrast 1.0
        Luminosity 1.17e7
        TwistMagn 50
    }
}
