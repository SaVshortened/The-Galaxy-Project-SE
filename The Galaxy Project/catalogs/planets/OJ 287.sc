LogLevel    1

Barycenter "OJ 287 A bar"
{
    ParentBody "OJ 287 system"

    Orbit
    {
        RefPlane        "Extrasolar"
        Period          9.23
        SemiMajorAxis   94.4
        Eccentricity    0.657
        Inclination     90
        AscendingNode   0
        ArgOfPericenter 270
        MeanAnomaly     270
    }
}

Star	"OJ 287 A*"
{
    ParentBody "OJ 287 A bar"
    Class      "X"
    MassSol    1.835e10

    RotationModel "IAU"
    {
        ValidRange     "Unlimited"
        Epoch          2451545
        PoleRA         133.7036
        PoleDec        20.1085
        PrimeMeridian  0
        RotationRate   24
    }

	AccretionDisk
	{
        InnerRadius       1087
        OuterRadius       20600
		InnerThickness    80.2
		OuterThickness    334
		Temperature       17000
        Brightness        1
        Density           4.2467e-10
        DiskNoiseContrast 0.8
        DiskTempContrast  1.0
        Luminosity        6.5e10
        TwistMagn         50
	}

	NoCorona        true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Static"
		Period          0
		SemiMajorAxis   0
		Eccentricity    0
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "OJ 287 B*"
{
    ParentBody "OJ 287 system"
    Class      "X"
    MassSol    1.50e8
    NoAccretionDisk true

    	AccretionDisk
	{
        InnerRadius       0
        OuterRadius       0
		InnerThickness    0
		OuterThickness    0
		Temperature       0
        Brightness        0
        Density           0
        DiskNoiseContrast 0
        DiskTempContrast  0
        Luminosity        0
        TwistMagn         0
	}

    Orbit
    {
        RefPlane        "Extrasolar"
        Period          9.23
        SemiMajorAxis   11546.6
        Eccentricity    0.657
        Inclination     90
        AscendingNode   0
        ArgOfPericenter 90
        MeanAnomaly     90
    }
}
