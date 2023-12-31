package com.pseudoankit.icon

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily

sealed class FaIcon(val src: String) {
    data class Solid(private val icon: String) : FaIcon(icon) {
        constructor(intIcon: Int) : this(intIcon.asString)
    }

    data class Regular(private val icon: String) : FaIcon(icon) {
        constructor(intIcon: Int) : this(intIcon.asString)
    }

    data class Brand(private val icon: String) : FaIcon(icon) {
        constructor(intIcon: Int) : this(intIcon.asString)
    }

    internal val fontFamily: FontFamily
        get() {
            return when (this) {
                is Brand -> FontFamily(Font(resId = R.font.fa_brands_400))
                is Solid -> FontFamily(Font(resId = R.font.fa_solid_900))
                is Regular -> FontFamily(Font(resId = R.font.fa_regular_400))
            }
        }

    companion object {
        private val Int.asString get() = toChar().toString()

        // https://fontawesome.com/icons/accessible-icon?style=brands
        // Brands icon : AccessibleIcon
        val AccessibleIcon = Brand(0xf368)

        // https://fontawesome.com/icons/accusoft?style=brands
        // Brands icon : Accusoft
        val Accusoft = Brand(0xf369)

        // https://fontawesome.com/icons/acquisitions-incorporated?style=brands
        // Brands icon : AcquisitionsIncorporated
        val AcquisitionsIncorporated = Brand(0xf6af)

        // https://fontawesome.com/icons/ad?style=solid
        // Solid icon : Ad
        val Ad = Solid(0xf641)

        // https://fontawesome.com/icons/address-book?style=solid
        // Solid icon : AddressBook
        val AddressBook = Solid(0xf2b9)

        // https://fontawesome.com/icons/address-book?style=regular
        // Regular icon : AddressBook
        val AddressBookRegular = Regular(0xf2b9)

        // https://fontawesome.com/icons/address-card?style=solid
        // Solid icon : AddressCard
        val AddressCard = Solid(0xf2bb)

        // https://fontawesome.com/icons/address-card?style=regular
        // Regular icon : AddressCard
        val AddressCardRegular = Regular(0xf2bb)

        // https://fontawesome.com/icons/adjust?style=solid
        // Solid icon : Adjust
        val Adjust = Solid(0xf042)

        // https://fontawesome.com/icons/adn?style=brands
        // Brands icon : Adn
        val Adn = Brand(0xf170)

        // https://fontawesome.com/icons/adversal?style=brands
        // Brands icon : Adversal
        val Adversal = Brand(0xf36a)

        // https://fontawesome.com/icons/affiliatetheme?style=brands
        // Brands icon : Affiliatetheme
        val Affiliatetheme = Brand(0xf36b)

        // https://fontawesome.com/icons/air-freshener?style=solid
        // Solid icon : AirFreshener
        val AirFreshener = Solid(0xf5d0)

        // https://fontawesome.com/icons/airbnb?style=brands
        // Brands icon : Airbnb
        val Airbnb = Brand(0xf834)

        // https://fontawesome.com/icons/algolia?style=brands
        // Brands icon : Algolia
        val Algolia = Brand(0xf36c)

        // https://fontawesome.com/icons/align-center?style=solid
        // Solid icon : AlignCenter
        val AlignCenter = Solid(0xf037)

        // https://fontawesome.com/icons/align-justify?style=solid
        // Solid icon : AlignJustify
        val AlignJustify = Solid(0xf039)

        // https://fontawesome.com/icons/align-left?style=solid
        // Solid icon : AlignLeft
        val AlignLeft = Solid(0xf036)

        // https://fontawesome.com/icons/align-right?style=solid
        // Solid icon : AlignRight
        val AlignRight = Solid(0xf038)

        // https://fontawesome.com/icons/alipay?style=brands
        // Brands icon : Alipay
        val Alipay = Brand(0xf642)

        // https://fontawesome.com/icons/allergies?style=solid
        // Solid icon : Allergies
        val Allergies = Solid(0xf461)

        // https://fontawesome.com/icons/amazon?style=brands
        // Brands icon : Amazon
        val Amazon = Brand(0xf270)

        // https://fontawesome.com/icons/amazon-pay?style=brands
        // Brands icon : AmazonPay
        val AmazonPay = Brand(0xf42c)

        // https://fontawesome.com/icons/ambulance?style=solid
        // Solid icon : Ambulance
        val Ambulance = Solid(0xf0f9)

        // https://fontawesome.com/icons/american-sign-language-interpreting?style=solid
        // Solid icon : AmericanSignLanguageInterpreting
        val AmericanSignLanguageInterpreting = Solid(0xf2a3)

        // https://fontawesome.com/icons/amilia?style=brands
        // Brands icon : Amilia
        val Amilia = Brand(0xf36d)

        // https://fontawesome.com/icons/anchor?style=solid
        // Solid icon : Anchor
        val Anchor = Solid(0xf13d)

        // https://fontawesome.com/icons/android?style=brands
        // Brands icon : Android
        val Android = Brand(0xf17b)

        // https://fontawesome.com/icons/angellist?style=brands
        // Brands icon : Angellist
        val Angellist = Brand(0xf209)

        // https://fontawesome.com/icons/angle-double-down?style=solid
        // Solid icon : AngleDoubleDown
        val AngleDoubleDown = Solid(0xf103)

        // https://fontawesome.com/icons/angle-double-left?style=solid
        // Solid icon : AngleDoubleLeft
        val AngleDoubleLeft = Solid(0xf100)

        // https://fontawesome.com/icons/angle-double-right?style=solid
        // Solid icon : AngleDoubleRight
        val AngleDoubleRight = Solid(0xf101)

        // https://fontawesome.com/icons/angle-double-up?style=solid
        // Solid icon : AngleDoubleUp
        val AngleDoubleUp = Solid(0xf102)

        // https://fontawesome.com/icons/angle-down?style=solid
        // Solid icon : AngleDown
        val AngleDown = Solid(0xf107)

        // https://fontawesome.com/icons/angle-left?style=solid
        // Solid icon : AngleLeft
        val AngleLeft = Solid(0xf104)

        // https://fontawesome.com/icons/angle-right?style=solid
        // Solid icon : AngleRight
        val AngleRight = Solid(0xf105)

        // https://fontawesome.com/icons/angle-up?style=solid
        // Solid icon : AngleUp
        val AngleUp = Solid(0xf106)

        // https://fontawesome.com/icons/angry?style=solid
        // Solid icon : Angry
        val Angry = Solid(0xf556)

        // https://fontawesome.com/icons/angry?style=regular
        // Regular icon : Angry
        val AngryRegular = Regular(0xf556)

        // https://fontawesome.com/icons/angrycreative?style=brands
        // Brands icon : Angrycreative
        val Angrycreative = Brand(0xf36e)

        // https://fontawesome.com/icons/angular?style=brands
        // Brands icon : Angular
        val Angular = Brand(0xf420)

        // https://fontawesome.com/icons/ankh?style=solid
        // Solid icon : Ankh
        val Ankh = Solid(0xf644)

        // https://fontawesome.com/icons/app-store?style=brands
        // Brands icon : AppStore
        val AppStore = Brand(0xf36f)

        // https://fontawesome.com/icons/app-store-ios?style=brands
        // Brands icon : AppStoreIos
        val AppStoreIos = Brand(0xf370)

        // https://fontawesome.com/icons/apper?style=brands
        // Brands icon : Apper
        val Apper = Brand(0xf371)

        // https://fontawesome.com/icons/apple?style=brands
        // Brands icon : Apple
        val Apple = Brand(0xf179)

        // https://fontawesome.com/icons/apple-alt?style=solid
        // Solid icon : AppleAlt
        val AppleAlt = Solid(0xf5d1)

        // https://fontawesome.com/icons/apple-pay?style=brands
        // Brands icon : ApplePay
        val ApplePay = Brand(0xf415)

        // https://fontawesome.com/icons/archive?style=solid
        // Solid icon : Archive
        val Archive = Solid(0xf187)

        // https://fontawesome.com/icons/archway?style=solid
        // Solid icon : Archway
        val Archway = Solid(0xf557)

        // https://fontawesome.com/icons/arrow-alt-circle-down?style=solid
        // Solid icon : ArrowAltCircleDown
        val ArrowAltCircleDown = Solid(0xf358)

        // https://fontawesome.com/icons/arrow-alt-circle-down?style=regular
        // Regular icon : ArrowAltCircleDown
        val ArrowAltCircleDownRegular = Regular(0xf358)

        // https://fontawesome.com/icons/arrow-alt-circle-left?style=solid
        // Solid icon : ArrowAltCircleLeft
        val ArrowAltCircleLeft = Solid(0xf359)

        // https://fontawesome.com/icons/arrow-alt-circle-left?style=regular
        // Regular icon : ArrowAltCircleLeft
        val ArrowAltCircleLeftRegular = Regular(0xf359)

        // https://fontawesome.com/icons/arrow-alt-circle-right?style=solid
        // Solid icon : ArrowAltCircleRight
        val ArrowAltCircleRight = Solid(0xf35a)

        // https://fontawesome.com/icons/arrow-alt-circle-right?style=regular
        // Regular icon : ArrowAltCircleRight
        val ArrowAltCircleRightRegular = Regular(0xf35a)

        // https://fontawesome.com/icons/arrow-alt-circle-up?style=solid
        // Solid icon : ArrowAltCircleUp
        val ArrowAltCircleUp = Solid(0xf35b)

        // https://fontawesome.com/icons/arrow-alt-circle-up?style=regular
        // Regular icon : ArrowAltCircleUp
        val ArrowAltCircleUpRegular = Regular(0xf35b)

        // https://fontawesome.com/icons/arrow-circle-down?style=solid
        // Solid icon : ArrowCircleDown
        val ArrowCircleDown = Solid(0xf0ab)

        // https://fontawesome.com/icons/arrow-circle-left?style=solid
        // Solid icon : ArrowCircleLeft
        val ArrowCircleLeft = Solid(0xf0a8)

        // https://fontawesome.com/icons/arrow-circle-right?style=solid
        // Solid icon : ArrowCircleRight
        val ArrowCircleRight = Solid(0xf0a9)

        // https://fontawesome.com/icons/arrow-circle-up?style=solid
        // Solid icon : ArrowCircleUp
        val ArrowCircleUp = Solid(0xf0aa)

        // https://fontawesome.com/icons/arrow-down?style=solid
        // Solid icon : ArrowDown
        val ArrowDown = Solid(0xf063)

        // https://fontawesome.com/icons/arrow-left?style=solid
        // Solid icon : ArrowLeft
        val ArrowLeft = Solid(0xf060)

        // https://fontawesome.com/icons/arrow-right?style=solid
        // Solid icon : ArrowRight
        val ArrowRight = Solid(0xf061)

        // https://fontawesome.com/icons/arrow-up?style=solid
        // Solid icon : ArrowUp
        val ArrowUp = Solid(0xf062)

        // https://fontawesome.com/icons/arrows-alt?style=solid
        // Solid icon : ArrowsAlt
        val ArrowsAlt = Solid(0xf0b2)

        // https://fontawesome.com/icons/arrows-alt-h?style=solid
        // Solid icon : ArrowsAltH
        val ArrowsAltH = Solid(0xf337)

        // https://fontawesome.com/icons/arrows-alt-v?style=solid
        // Solid icon : ArrowsAltV
        val ArrowsAltV = Solid(0xf338)

        // https://fontawesome.com/icons/artstation?style=brands
        // Brands icon : Artstation
        val Artstation = Brand(0xf77a)

        // https://fontawesome.com/icons/assistive-listening-systems?style=solid
        // Solid icon : AssistiveListeningSystems
        val AssistiveListeningSystems = Solid(0xf2a2)

        // https://fontawesome.com/icons/asterisk?style=solid
        // Solid icon : Asterisk
        val Asterisk = Solid(0xf069)

        // https://fontawesome.com/icons/asymmetrik?style=brands
        // Brands icon : Asymmetrik
        val Asymmetrik = Brand(0xf372)

        // https://fontawesome.com/icons/at?style=solid
        // Solid icon : At
        val At = Solid(0xf1fa)

        // https://fontawesome.com/icons/atlas?style=solid
        // Solid icon : Atlas
        val Atlas = Solid(0xf558)

        // https://fontawesome.com/icons/atlassian?style=brands
        // Brands icon : Atlassian
        val Atlassian = Brand(0xf77b)

        // https://fontawesome.com/icons/atom?style=solid
        // Solid icon : Atom
        val Atom = Solid(0xf5d2)

        // https://fontawesome.com/icons/audible?style=brands
        // Brands icon : Audible
        val Audible = Brand(0xf373)

        // https://fontawesome.com/icons/audio-description?style=solid
        // Solid icon : AudioDescription
        val AudioDescription = Solid(0xf29e)

        // https://fontawesome.com/icons/autoprefixer?style=brands
        // Brands icon : Autoprefixer
        val Autoprefixer = Brand(0xf41c)

        // https://fontawesome.com/icons/avianex?style=brands
        // Brands icon : Avianex
        val Avianex = Brand(0xf374)

        // https://fontawesome.com/icons/aviato?style=brands
        // Brands icon : Aviato
        val Aviato = Brand(0xf421)

        // https://fontawesome.com/icons/award?style=solid
        // Solid icon : Award
        val Award = Solid(0xf559)

        // https://fontawesome.com/icons/aws?style=brands
        // Brands icon : Aws
        val Aws = Brand(0xf375)

        // https://fontawesome.com/icons/baby?style=solid
        // Solid icon : Baby
        val Baby = Solid(0xf77c)

        // https://fontawesome.com/icons/baby-carriage?style=solid
        // Solid icon : BabyCarriage
        val BabyCarriage = Solid(0xf77d)

        // https://fontawesome.com/icons/backspace?style=solid
        // Solid icon : Backspace
        val Backspace = Solid(0xf55a)

        // https://fontawesome.com/icons/backward?style=solid
        // Solid icon : Backward
        val Backward = Solid(0xf04a)

        // https://fontawesome.com/icons/bacon?style=solid
        // Solid icon : Bacon
        val Bacon = Solid(0xf7e5)

        // https://fontawesome.com/icons/bacteria?style=solid
        // Solid icon : Bacteria
        val Bacteria = Solid(0xe059)

        // https://fontawesome.com/icons/bacterium?style=solid
        // Solid icon : Bacterium
        val Bacterium = Solid(0xe05a)

        // https://fontawesome.com/icons/bahai?style=solid
        // Solid icon : Bahai
        val Bahai = Solid(0xf666)

        // https://fontawesome.com/icons/balance-scale?style=solid
        // Solid icon : BalanceScale
        val BalanceScale = Solid(0xf24e)

        // https://fontawesome.com/icons/balance-scale-left?style=solid
        // Solid icon : BalanceScaleLeft
        val BalanceScaleLeft = Solid(0xf515)

        // https://fontawesome.com/icons/balance-scale-right?style=solid
        // Solid icon : BalanceScaleRight
        val BalanceScaleRight = Solid(0xf516)

        // https://fontawesome.com/icons/ban?style=solid
        // Solid icon : Ban
        val Ban = Solid(0xf05e)

        // https://fontawesome.com/icons/band-aid?style=solid
        // Solid icon : BandAid
        val BandAid = Solid(0xf462)

        // https://fontawesome.com/icons/bandcamp?style=brands
        // Brands icon : Bandcamp
        val Bandcamp = Brand(0xf2d5)

        // https://fontawesome.com/icons/barcode?style=solid
        // Solid icon : Barcode
        val Barcode = Solid(0xf02a)

        // https://fontawesome.com/icons/bars?style=solid
        // Solid icon : Bars
        val Bars = Solid(0xf0c9)

        // https://fontawesome.com/icons/baseball-ball?style=solid
        // Solid icon : BaseballBall
        val BaseballBall = Solid(0xf433)

        // https://fontawesome.com/icons/basketball-ball?style=solid
        // Solid icon : BasketballBall
        val BasketballBall = Solid(0xf434)

        // https://fontawesome.com/icons/bath?style=solid
        // Solid icon : Bath
        val Bath = Solid(0xf2cd)

        // https://fontawesome.com/icons/battery-empty?style=solid
        // Solid icon : BatteryEmpty
        val BatteryEmpty = Solid(0xf244)

        // https://fontawesome.com/icons/battery-full?style=solid
        // Solid icon : BatteryFull
        val BatteryFull = Solid(0xf240)

        // https://fontawesome.com/icons/battery-half?style=solid
        // Solid icon : BatteryHalf
        val BatteryHalf = Solid(0xf242)

        // https://fontawesome.com/icons/battery-quarter?style=solid
        // Solid icon : BatteryQuarter
        val BatteryQuarter = Solid(0xf243)

        // https://fontawesome.com/icons/battery-three-quarters?style=solid
        // Solid icon : BatteryThreeQuarters
        val BatteryThreeQuarters = Solid(0xf241)

        // https://fontawesome.com/icons/battle-net?style=brands
        // Brands icon : BattleNet
        val BattleNet = Brand(0xf835)

        // https://fontawesome.com/icons/bed?style=solid
        // Solid icon : Bed
        val Bed = Solid(0xf236)

        // https://fontawesome.com/icons/beer?style=solid
        // Solid icon : Beer
        val Beer = Solid(0xf0fc)

        // https://fontawesome.com/icons/behance?style=brands
        // Brands icon : Behance
        val Behance = Brand(0xf1b4)

        // https://fontawesome.com/icons/behance-square?style=brands
        // Brands icon : BehanceSquare
        val BehanceSquare = Brand(0xf1b5)

        // https://fontawesome.com/icons/bell?style=solid
        // Solid icon : Bell
        val Bell = Solid(0xf0f3)

        // https://fontawesome.com/icons/bell?style=regular
        // Regular icon : Bell
        val BellRegular = Regular(0xf0f3)

        // https://fontawesome.com/icons/bell-slash?style=solid
        // Solid icon : BellSlash
        val BellSlash = Solid(0xf1f6)

        // https://fontawesome.com/icons/bell-slash?style=regular
        // Regular icon : BellSlash
        val BellSlashRegular = Regular(0xf1f6)

        // https://fontawesome.com/icons/bezier-curve?style=solid
        // Solid icon : BezierCurve
        val BezierCurve = Solid(0xf55b)

        // https://fontawesome.com/icons/bible?style=solid
        // Solid icon : Bible
        val Bible = Solid(0xf647)

        // https://fontawesome.com/icons/bicycle?style=solid
        // Solid icon : Bicycle
        val Bicycle = Solid(0xf206)

        // https://fontawesome.com/icons/biking?style=solid
        // Solid icon : Biking
        val Biking = Solid(0xf84a)

        // https://fontawesome.com/icons/bimobject?style=brands
        // Brands icon : Bimobject
        val Bimobject = Brand(0xf378)

        // https://fontawesome.com/icons/binoculars?style=solid
        // Solid icon : Binoculars
        val Binoculars = Solid(0xf1e5)

        // https://fontawesome.com/icons/biohazard?style=solid
        // Solid icon : Biohazard
        val Biohazard = Solid(0xf780)

        // https://fontawesome.com/icons/birthday-cake?style=solid
        // Solid icon : BirthdayCake
        val BirthdayCake = Solid(0xf1fd)

        // https://fontawesome.com/icons/bitbucket?style=brands
        // Brands icon : Bitbucket
        val Bitbucket = Brand(0xf171)

        // https://fontawesome.com/icons/bitcoin?style=brands
        // Brands icon : Bitcoin
        val Bitcoin = Brand(0xf379)

        // https://fontawesome.com/icons/bity?style=brands
        // Brands icon : Bity
        val Bity = Brand(0xf37a)

        // https://fontawesome.com/icons/black-tie?style=brands
        // Brands icon : BlackTie
        val BlackTie = Brand(0xf27e)

        // https://fontawesome.com/icons/blackberry?style=brands
        // Brands icon : Blackberry
        val Blackberry = Brand(0xf37b)

        // https://fontawesome.com/icons/blender?style=solid
        // Solid icon : Blender
        val Blender = Solid(0xf517)

        // https://fontawesome.com/icons/blender-phone?style=solid
        // Solid icon : BlenderPhone
        val BlenderPhone = Solid(0xf6b6)

        // https://fontawesome.com/icons/blind?style=solid
        // Solid icon : Blind
        val Blind = Solid(0xf29d)

        // https://fontawesome.com/icons/blog?style=solid
        // Solid icon : Blog
        val Blog = Solid(0xf781)

        // https://fontawesome.com/icons/blogger?style=brands
        // Brands icon : Blogger
        val Blogger = Brand(0xf37c)

        // https://fontawesome.com/icons/blogger-b?style=brands
        // Brands icon : BloggerB
        val BloggerB = Brand(0xf37d)

        // https://fontawesome.com/icons/bluetooth?style=brands
        // Brands icon : Bluetooth
        val Bluetooth = Brand(0xf293)

        // https://fontawesome.com/icons/bluetooth-b?style=brands
        // Brands icon : BluetoothB
        val BluetoothB = Brand(0xf294)

        // https://fontawesome.com/icons/bold?style=solid
        // Solid icon : Bold
        val Bold = Solid(0xf032)

        // https://fontawesome.com/icons/bolt?style=solid
        // Solid icon : Bolt
        val Bolt = Solid(0xf0e7)

        // https://fontawesome.com/icons/bomb?style=solid
        // Solid icon : Bomb
        val Bomb = Solid(0xf1e2)

        // https://fontawesome.com/icons/bone?style=solid
        // Solid icon : Bone
        val Bone = Solid(0xf5d7)

        // https://fontawesome.com/icons/bong?style=solid
        // Solid icon : Bong
        val Bong = Solid(0xf55c)

        // https://fontawesome.com/icons/book?style=solid
        // Solid icon : Book
        val Book = Solid(0xf02d)

        // https://fontawesome.com/icons/book-dead?style=solid
        // Solid icon : BookDead
        val BookDead = Solid(0xf6b7)

        // https://fontawesome.com/icons/book-medical?style=solid
        // Solid icon : BookMedical
        val BookMedical = Solid(0xf7e6)

        // https://fontawesome.com/icons/book-open?style=solid
        // Solid icon : BookOpen
        val BookOpen = Solid(0xf518)

        // https://fontawesome.com/icons/book-reader?style=solid
        // Solid icon : BookReader
        val BookReader = Solid(0xf5da)

        // https://fontawesome.com/icons/bookmark?style=solid
        // Solid icon : Bookmark
        val Bookmark = Solid(0xf02e)

        // https://fontawesome.com/icons/bookmark?style=regular
        // Regular icon : Bookmark
        val BookmarkRegular = Regular(0xf02e)

        // https://fontawesome.com/icons/bootstrap?style=brands
        // Brands icon : Bootstrap
        val Bootstrap = Brand(0xf836)

        // https://fontawesome.com/icons/border-all?style=solid
        // Solid icon : BorderAll
        val BorderAll = Solid(0xf84c)

        // https://fontawesome.com/icons/border-none?style=solid
        // Solid icon : BorderNone
        val BorderNone = Solid(0xf850)

        // https://fontawesome.com/icons/border-style?style=solid
        // Solid icon : BorderStyle
        val BorderStyle = Solid(0xf853)

        // https://fontawesome.com/icons/bowling-ball?style=solid
        // Solid icon : BowlingBall
        val BowlingBall = Solid(0xf436)

        // https://fontawesome.com/icons/box?style=solid
        // Solid icon : Box
        val Box = Solid(0xf466)

        // https://fontawesome.com/icons/box-open?style=solid
        // Solid icon : BoxOpen
        val BoxOpen = Solid(0xf49e)

        // https://fontawesome.com/icons/box-tissue?style=solid
        // Solid icon : BoxTissue
        val BoxTissue = Solid(0xe05b)

        // https://fontawesome.com/icons/boxes?style=solid
        // Solid icon : Boxes
        val Boxes = Solid(0xf468)

        // https://fontawesome.com/icons/braille?style=solid
        // Solid icon : Braille
        val Braille = Solid(0xf2a1)

        // https://fontawesome.com/icons/brain?style=solid
        // Solid icon : Brain
        val Brain = Solid(0xf5dc)

        // https://fontawesome.com/icons/bread-slice?style=solid
        // Solid icon : BreadSlice
        val BreadSlice = Solid(0xf7ec)

        // https://fontawesome.com/icons/briefcase?style=solid
        // Solid icon : Briefcase
        val Briefcase = Solid(0xf0b1)

        // https://fontawesome.com/icons/briefcase-medical?style=solid
        // Solid icon : BriefcaseMedical
        val BriefcaseMedical = Solid(0xf469)

        // https://fontawesome.com/icons/broadcast-tower?style=solid
        // Solid icon : BroadcastTower
        val BroadcastTower = Solid(0xf519)

        // https://fontawesome.com/icons/broom?style=solid
        // Solid icon : Broom
        val Broom = Solid(0xf51a)

        // https://fontawesome.com/icons/brush?style=solid
        // Solid icon : Brush
        val Brush = Solid(0xf55d)

        // https://fontawesome.com/icons/btc?style=brands
        // Brands icon : Btc
        val Btc = Brand(0xf15a)

        // https://fontawesome.com/icons/buffer?style=brands
        // Brands icon : Buffer
        val Buffer = Brand(0xf837)

        // https://fontawesome.com/icons/bug?style=solid
        // Solid icon : Bug
        val Bug = Solid(0xf188)

        // https://fontawesome.com/icons/building?style=solid
        // Solid icon : Building
        val Building = Solid(0xf1ad)

        // https://fontawesome.com/icons/building?style=regular
        // Regular icon : Building
        val BuildingRegular = Regular(0xf1ad)

        // https://fontawesome.com/icons/bullhorn?style=solid
        // Solid icon : Bullhorn
        val Bullhorn = Solid(0xf0a1)

        // https://fontawesome.com/icons/bullseye?style=solid
        // Solid icon : Bullseye
        val Bullseye = Solid(0xf140)

        // https://fontawesome.com/icons/burn?style=solid
        // Solid icon : Burn
        val Burn = Solid(0xf46a)

        // https://fontawesome.com/icons/buromobelexperte?style=brands
        // Brands icon : Buromobelexperte
        val Buromobelexperte = Brand(0xf37f)

        // https://fontawesome.com/icons/bus?style=solid
        // Solid icon : Bus
        val Bus = Solid(0xf207)

        // https://fontawesome.com/icons/bus-alt?style=solid
        // Solid icon : BusAlt
        val BusAlt = Solid(0xf55e)

        // https://fontawesome.com/icons/business-time?style=solid
        // Solid icon : BusinessTime
        val BusinessTime = Solid(0xf64a)

        // https://fontawesome.com/icons/buy-n-large?style=brands
        // Brands icon : BuyNLarge
        val BuyNLarge = Brand(0xf8a6)

        // https://fontawesome.com/icons/buysellads?style=brands
        // Brands icon : Buysellads
        val Buysellads = Brand(0xf20d)

        // https://fontawesome.com/icons/calculator?style=solid
        // Solid icon : Calculator
        val Calculator = Solid(0xf1ec)

        // https://fontawesome.com/icons/calendar?style=solid
        // Solid icon : Calendar
        val Calendar = Solid(0xf133)

        // https://fontawesome.com/icons/calendar?style=regular
        // Regular icon : Calendar
        val CalendarRegular = Regular(0xf133)

        // https://fontawesome.com/icons/calendar-alt?style=solid
        // Solid icon : CalendarAlt
        val CalendarAlt = Solid(0xf073)

        // https://fontawesome.com/icons/calendar-alt?style=regular
        // Regular icon : CalendarAlt
        val CalendarAltRegular = Regular(0xf073)

        // https://fontawesome.com/icons/calendar-check?style=solid
        // Solid icon : CalendarCheck
        val CalendarCheck = Solid(0xf274)

        // https://fontawesome.com/icons/calendar-check?style=regular
        // Regular icon : CalendarCheck
        val CalendarCheckRegular = Regular(0xf274)

        // https://fontawesome.com/icons/calendar-day?style=solid
        // Solid icon : CalendarDay
        val CalendarDay = Solid(0xf783)

        // https://fontawesome.com/icons/calendar-minus?style=solid
        // Solid icon : CalendarMinus
        val CalendarMinus = Solid(0xf272)

        // https://fontawesome.com/icons/calendar-minus?style=regular
        // Regular icon : CalendarMinus
        val CalendarMinusRegular = Regular(0xf272)

        // https://fontawesome.com/icons/calendar-plus?style=solid
        // Solid icon : CalendarPlus
        val CalendarPlus = Solid(0xf271)

        // https://fontawesome.com/icons/calendar-plus?style=regular
        // Regular icon : CalendarPlus
        val CalendarPlusRegular = Regular(0xf271)

        // https://fontawesome.com/icons/calendar-times?style=solid
        // Solid icon : CalendarTimes
        val CalendarTimes = Solid(0xf273)

        // https://fontawesome.com/icons/calendar-times?style=regular
        // Regular icon : CalendarTimes
        val CalendarTimesRegular = Regular(0xf273)

        // https://fontawesome.com/icons/calendar-week?style=solid
        // Solid icon : CalendarWeek
        val CalendarWeek = Solid(0xf784)

        // https://fontawesome.com/icons/camera?style=solid
        // Solid icon : Camera
        val Camera = Solid(0xf030)

        // https://fontawesome.com/icons/camera-retro?style=solid
        // Solid icon : CameraRetro
        val CameraRetro = Solid(0xf083)

        // https://fontawesome.com/icons/campground?style=solid
        // Solid icon : Campground
        val Campground = Solid(0xf6bb)

        // https://fontawesome.com/icons/canadian-maple-leaf?style=brands
        // Brands icon : CanadianMapleLeaf
        val CanadianMapleLeaf = Brand(0xf785)

        // https://fontawesome.com/icons/candy-cane?style=solid
        // Solid icon : CandyCane
        val CandyCane = Solid(0xf786)

        // https://fontawesome.com/icons/cannabis?style=solid
        // Solid icon : Cannabis
        val Cannabis = Solid(0xf55f)

        // https://fontawesome.com/icons/capsules?style=solid
        // Solid icon : Capsules
        val Capsules = Solid(0xf46b)

        // https://fontawesome.com/icons/car?style=solid
        // Solid icon : Car
        val Car = Solid(0xf1b9)

        // https://fontawesome.com/icons/car-alt?style=solid
        // Solid icon : CarAlt
        val CarAlt = Solid(0xf5de)

        // https://fontawesome.com/icons/car-battery?style=solid
        // Solid icon : CarBattery
        val CarBattery = Solid(0xf5df)

        // https://fontawesome.com/icons/car-crash?style=solid
        // Solid icon : CarCrash
        val CarCrash = Solid(0xf5e1)

        // https://fontawesome.com/icons/car-side?style=solid
        // Solid icon : CarSide
        val CarSide = Solid(0xf5e4)

        // https://fontawesome.com/icons/caravan?style=solid
        // Solid icon : Caravan
        val Caravan = Solid(0xf8ff)

        // https://fontawesome.com/icons/caret-down?style=solid
        // Solid icon : CaretDown
        val CaretDown = Solid(0xf0d7)

        // https://fontawesome.com/icons/caret-left?style=solid
        // Solid icon : CaretLeft
        val CaretLeft = Solid(0xf0d9)

        // https://fontawesome.com/icons/caret-right?style=solid
        // Solid icon : CaretRight
        val CaretRight = Solid(0xf0da)

        // https://fontawesome.com/icons/caret-square-down?style=solid
        // Solid icon : CaretSquareDown
        val CaretSquareDown = Solid(0xf150)

        // https://fontawesome.com/icons/caret-square-down?style=regular
        // Regular icon : CaretSquareDown
        val CaretSquareDownRegular = Regular(0xf150)

        // https://fontawesome.com/icons/caret-square-left?style=solid
        // Solid icon : CaretSquareLeft
        val CaretSquareLeft = Solid(0xf191)

        // https://fontawesome.com/icons/caret-square-left?style=regular
        // Regular icon : CaretSquareLeft
        val CaretSquareLeftRegular = Regular(0xf191)

        // https://fontawesome.com/icons/caret-square-right?style=solid
        // Solid icon : CaretSquareRight
        val CaretSquareRight = Solid(0xf152)

        // https://fontawesome.com/icons/caret-square-right?style=regular
        // Regular icon : CaretSquareRight
        val CaretSquareRightRegular = Regular(0xf152)

        // https://fontawesome.com/icons/caret-square-up?style=solid
        // Solid icon : CaretSquareUp
        val CaretSquareUp = Solid(0xf151)

        // https://fontawesome.com/icons/caret-square-up?style=regular
        // Regular icon : CaretSquareUp
        val CaretSquareUpRegular = Regular(0xf151)

        // https://fontawesome.com/icons/caret-up?style=solid
        // Solid icon : CaretUp
        val CaretUp = Solid(0xf0d8)

        // https://fontawesome.com/icons/carrot?style=solid
        // Solid icon : Carrot
        val Carrot = Solid(0xf787)

        // https://fontawesome.com/icons/cart-arrow-down?style=solid
        // Solid icon : CartArrowDown
        val CartArrowDown = Solid(0xf218)

        // https://fontawesome.com/icons/cart-plus?style=solid
        // Solid icon : CartPlus
        val CartPlus = Solid(0xf217)

        // https://fontawesome.com/icons/cash-register?style=solid
        // Solid icon : CashRegister
        val CashRegister = Solid(0xf788)

        // https://fontawesome.com/icons/cat?style=solid
        // Solid icon : Cat
        val Cat = Solid(0xf6be)

        // https://fontawesome.com/icons/cc-amazon-pay?style=brands
        // Brands icon : CcAmazonPay
        val CcAmazonPay = Brand(0xf42d)

        // https://fontawesome.com/icons/cc-amex?style=brands
        // Brands icon : CcAmex
        val CcAmex = Brand(0xf1f3)

        // https://fontawesome.com/icons/cc-apple-pay?style=brands
        // Brands icon : CcApplePay
        val CcApplePay = Brand(0xf416)

        // https://fontawesome.com/icons/cc-diners-club?style=brands
        // Brands icon : CcDinersClub
        val CcDinersClub = Brand(0xf24c)

        // https://fontawesome.com/icons/cc-discover?style=brands
        // Brands icon : CcDiscover
        val CcDiscover = Brand(0xf1f2)

        // https://fontawesome.com/icons/cc-jcb?style=brands
        // Brands icon : CcJcb
        val CcJcb = Brand(0xf24b)

        // https://fontawesome.com/icons/cc-mastercard?style=brands
        // Brands icon : CcMastercard
        val CcMastercard = Brand(0xf1f1)

        // https://fontawesome.com/icons/cc-paypal?style=brands
        // Brands icon : CcPaypal
        val CcPaypal = Brand(0xf1f4)

        // https://fontawesome.com/icons/cc-stripe?style=brands
        // Brands icon : CcStripe
        val CcStripe = Brand(0xf1f5)

        // https://fontawesome.com/icons/cc-visa?style=brands
        // Brands icon : CcVisa
        val CcVisa = Brand(0xf1f0)

        // https://fontawesome.com/icons/centercode?style=brands
        // Brands icon : Centercode
        val Centercode = Brand(0xf380)

        // https://fontawesome.com/icons/centos?style=brands
        // Brands icon : Centos
        val Centos = Brand(0xf789)

        // https://fontawesome.com/icons/certificate?style=solid
        // Solid icon : Certificate
        val Certificate = Solid(0xf0a3)

        // https://fontawesome.com/icons/chair?style=solid
        // Solid icon : Chair
        val Chair = Solid(0xf6c0)

        // https://fontawesome.com/icons/chalkboard?style=solid
        // Solid icon : Chalkboard
        val Chalkboard = Solid(0xf51b)

        // https://fontawesome.com/icons/chalkboard-teacher?style=solid
        // Solid icon : ChalkboardTeacher
        val ChalkboardTeacher = Solid(0xf51c)

        // https://fontawesome.com/icons/charging-station?style=solid
        // Solid icon : ChargingStation
        val ChargingStation = Solid(0xf5e7)

        // https://fontawesome.com/icons/chart-area?style=solid
        // Solid icon : ChartArea
        val ChartArea = Solid(0xf1fe)

        // https://fontawesome.com/icons/chart-bar?style=solid
        // Solid icon : ChartBar
        val ChartBar = Solid(0xf080)

        // https://fontawesome.com/icons/chart-bar?style=regular
        // Regular icon : ChartBar
        val ChartBarRegular = Regular(0xf080)

        // https://fontawesome.com/icons/chart-line?style=solid
        // Solid icon : ChartLine
        val ChartLine = Solid(0xf201)

        // https://fontawesome.com/icons/chart-pie?style=solid
        // Solid icon : ChartPie
        val ChartPie = Solid(0xf200)

        // https://fontawesome.com/icons/check?style=solid
        // Solid icon : Check
        val Check = Solid(0xf00c)

        // https://fontawesome.com/icons/check-circle?style=solid
        // Solid icon : CheckCircle
        val CheckCircle = Solid(0xf058)

        // https://fontawesome.com/icons/check-circle?style=regular
        // Regular icon : CheckCircle
        val CheckCircleRegular = Regular(0xf058)

        // https://fontawesome.com/icons/check-double?style=solid
        // Solid icon : CheckDouble
        val CheckDouble = Solid(0xf560)

        // https://fontawesome.com/icons/check-square?style=solid
        // Solid icon : CheckSquare
        val CheckSquare = Solid(0xf14a)

        // https://fontawesome.com/icons/check-square?style=regular
        // Regular icon : CheckSquare
        val CheckSquareRegular = Regular(0xf14a)

        // https://fontawesome.com/icons/cheese?style=solid
        // Solid icon : Cheese
        val Cheese = Solid(0xf7ef)

        // https://fontawesome.com/icons/chess?style=solid
        // Solid icon : Chess
        val Chess = Solid(0xf439)

        // https://fontawesome.com/icons/chess-bishop?style=solid
        // Solid icon : ChessBishop
        val ChessBishop = Solid(0xf43a)

        // https://fontawesome.com/icons/chess-board?style=solid
        // Solid icon : ChessBoard
        val ChessBoard = Solid(0xf43c)

        // https://fontawesome.com/icons/chess-king?style=solid
        // Solid icon : ChessKing
        val ChessKing = Solid(0xf43f)

        // https://fontawesome.com/icons/chess-knight?style=solid
        // Solid icon : ChessKnight
        val ChessKnight = Solid(0xf441)

        // https://fontawesome.com/icons/chess-pawn?style=solid
        // Solid icon : ChessPawn
        val ChessPawn = Solid(0xf443)

        // https://fontawesome.com/icons/chess-queen?style=solid
        // Solid icon : ChessQueen
        val ChessQueen = Solid(0xf445)

        // https://fontawesome.com/icons/chess-rook?style=solid
        // Solid icon : ChessRook
        val ChessRook = Solid(0xf447)

        // https://fontawesome.com/icons/chevron-circle-down?style=solid
        // Solid icon : ChevronCircleDown
        val ChevronCircleDown = Solid(0xf13a)

        // https://fontawesome.com/icons/chevron-circle-left?style=solid
        // Solid icon : ChevronCircleLeft
        val ChevronCircleLeft = Solid(0xf137)

        // https://fontawesome.com/icons/chevron-circle-right?style=solid
        // Solid icon : ChevronCircleRight
        val ChevronCircleRight = Solid(0xf138)

        // https://fontawesome.com/icons/chevron-circle-up?style=solid
        // Solid icon : ChevronCircleUp
        val ChevronCircleUp = Solid(0xf139)

        // https://fontawesome.com/icons/chevron-down?style=solid
        // Solid icon : ChevronDown
        val ChevronDown = Solid(0xf078)

        // https://fontawesome.com/icons/chevron-left?style=solid
        // Solid icon : ChevronLeft
        val ChevronLeft = Solid(0xf053)

        // https://fontawesome.com/icons/chevron-right?style=solid
        // Solid icon : ChevronRight
        val ChevronRight = Solid(0xf054)

        // https://fontawesome.com/icons/chevron-up?style=solid
        // Solid icon : ChevronUp
        val ChevronUp = Solid(0xf077)

        // https://fontawesome.com/icons/child?style=solid
        // Solid icon : Child
        val Child = Solid(0xf1ae)

        // https://fontawesome.com/icons/chrome?style=brands
        // Brands icon : Chrome
        val Chrome = Brand(0xf268)

        // https://fontawesome.com/icons/chromecast?style=brands
        // Brands icon : Chromecast
        val Chromecast = Brand(0xf838)

        // https://fontawesome.com/icons/church?style=solid
        // Solid icon : Church
        val Church = Solid(0xf51d)

        // https://fontawesome.com/icons/circle?style=solid
        // Solid icon : Circle
        val Circle = Solid(0xf111)

        // https://fontawesome.com/icons/circle?style=regular
        // Regular icon : Circle
        val CircleRegular = Regular(0xf111)

        // https://fontawesome.com/icons/circle-notch?style=solid
        // Solid icon : CircleNotch
        val CircleNotch = Solid(0xf1ce)

        // https://fontawesome.com/icons/city?style=solid
        // Solid icon : City
        val City = Solid(0xf64f)

        // https://fontawesome.com/icons/clinic-medical?style=solid
        // Solid icon : ClinicMedical
        val ClinicMedical = Solid(0xf7f2)

        // https://fontawesome.com/icons/clipboard?style=solid
        // Solid icon : Clipboard
        val Clipboard = Solid(0xf328)

        // https://fontawesome.com/icons/clipboard?style=regular
        // Regular icon : Clipboard
        val ClipboardRegular = Regular(0xf328)

        // https://fontawesome.com/icons/clipboard-check?style=solid
        // Solid icon : ClipboardCheck
        val ClipboardCheck = Solid(0xf46c)

        // https://fontawesome.com/icons/clipboard-list?style=solid
        // Solid icon : ClipboardList
        val ClipboardList = Solid(0xf46d)

        // https://fontawesome.com/icons/clock?style=solid
        // Solid icon : Clock
        val Clock = Solid(0xf017)

        // https://fontawesome.com/icons/clock?style=regular
        // Regular icon : Clock
        val ClockRegular = Regular(0xf017)

        // https://fontawesome.com/icons/clone?style=solid
        // Solid icon : Clone
        val Clone = Solid(0xf24d)

        // https://fontawesome.com/icons/clone?style=regular
        // Regular icon : Clone
        val CloneRegular = Regular(0xf24d)

        // https://fontawesome.com/icons/closed-captioning?style=solid
        // Solid icon : ClosedCaptioning
        val ClosedCaptioning = Solid(0xf20a)

        // https://fontawesome.com/icons/closed-captioning?style=regular
        // Regular icon : ClosedCaptioning
        val ClosedCaptioningRegular = Regular(0xf20a)

        // https://fontawesome.com/icons/cloud?style=solid
        // Solid icon : Cloud
        val Cloud = Solid(0xf0c2)

        // https://fontawesome.com/icons/cloud-download-alt?style=solid
        // Solid icon : CloudDownloadAlt
        val CloudDownloadAlt = Solid(0xf381)

        // https://fontawesome.com/icons/cloud-meatball?style=solid
        // Solid icon : CloudMeatball
        val CloudMeatball = Solid(0xf73b)

        // https://fontawesome.com/icons/cloud-moon?style=solid
        // Solid icon : CloudMoon
        val CloudMoon = Solid(0xf6c3)

        // https://fontawesome.com/icons/cloud-moon-rain?style=solid
        // Solid icon : CloudMoonRain
        val CloudMoonRain = Solid(0xf73c)

        // https://fontawesome.com/icons/cloud-rain?style=solid
        // Solid icon : CloudRain
        val CloudRain = Solid(0xf73d)

        // https://fontawesome.com/icons/cloud-showers-heavy?style=solid
        // Solid icon : CloudShowersHeavy
        val CloudShowersHeavy = Solid(0xf740)

        // https://fontawesome.com/icons/cloud-sun?style=solid
        // Solid icon : CloudSun
        val CloudSun = Solid(0xf6c4)

        // https://fontawesome.com/icons/cloud-sun-rain?style=solid
        // Solid icon : CloudSunRain
        val CloudSunRain = Solid(0xf743)

        // https://fontawesome.com/icons/cloud-upload-alt?style=solid
        // Solid icon : CloudUploadAlt
        val CloudUploadAlt = Solid(0xf382)

        // https://fontawesome.com/icons/cloudflare?style=brands
        // Brands icon : Cloudflare
        val Cloudflare = Brand(0xe07d)

        // https://fontawesome.com/icons/cloudscale?style=brands
        // Brands icon : Cloudscale
        val Cloudscale = Brand(0xf383)

        // https://fontawesome.com/icons/cloudsmith?style=brands
        // Brands icon : Cloudsmith
        val Cloudsmith = Brand(0xf384)

        // https://fontawesome.com/icons/cloudversify?style=brands
        // Brands icon : Cloudversify
        val Cloudversify = Brand(0xf385)

        // https://fontawesome.com/icons/cocktail?style=solid
        // Solid icon : Cocktail
        val Cocktail = Solid(0xf561)

        // https://fontawesome.com/icons/code?style=solid
        // Solid icon : Code
        val Code = Solid(0xf121)

        // https://fontawesome.com/icons/code-branch?style=solid
        // Solid icon : CodeBranch
        val CodeBranch = Solid(0xf126)

        // https://fontawesome.com/icons/codepen?style=brands
        // Brands icon : Codepen
        val Codepen = Brand(0xf1cb)

        // https://fontawesome.com/icons/codiepie?style=brands
        // Brands icon : Codiepie
        val Codiepie = Brand(0xf284)

        // https://fontawesome.com/icons/coffee?style=solid
        // Solid icon : Coffee
        val Coffee = Solid(0xf0f4)

        // https://fontawesome.com/icons/cog?style=solid
        // Solid icon : Cog
        val Cog = Solid(0xf013)

        // https://fontawesome.com/icons/cogs?style=solid
        // Solid icon : Cogs
        val Cogs = Solid(0xf085)

        // https://fontawesome.com/icons/coins?style=solid
        // Solid icon : Coins
        val Coins = Solid(0xf51e)

        // https://fontawesome.com/icons/columns?style=solid
        // Solid icon : Columns
        val Columns = Solid(0xf0db)

        // https://fontawesome.com/icons/comment?style=solid
        // Solid icon : Comment
        val Comment = Solid(0xf075)

        // https://fontawesome.com/icons/comment?style=regular
        // Regular icon : Comment
        val CommentRegular = Regular(0xf075)

        // https://fontawesome.com/icons/comment-alt?style=solid
        // Solid icon : CommentAlt
        val CommentAlt = Solid(0xf27a)

        // https://fontawesome.com/icons/comment-alt?style=regular
        // Regular icon : CommentAlt
        val CommentAltRegular = Regular(0xf27a)

        // https://fontawesome.com/icons/comment-dollar?style=solid
        // Solid icon : CommentDollar
        val CommentDollar = Solid(0xf651)

        // https://fontawesome.com/icons/comment-dots?style=solid
        // Solid icon : CommentDots
        val CommentDots = Solid(0xf4ad)

        // https://fontawesome.com/icons/comment-dots?style=regular
        // Regular icon : CommentDots
        val CommentDotsRegular = Regular(0xf4ad)

        // https://fontawesome.com/icons/comment-medical?style=solid
        // Solid icon : CommentMedical
        val CommentMedical = Solid(0xf7f5)

        // https://fontawesome.com/icons/comment-slash?style=solid
        // Solid icon : CommentSlash
        val CommentSlash = Solid(0xf4b3)

        // https://fontawesome.com/icons/comments?style=solid
        // Solid icon : Comments
        val Comments = Solid(0xf086)

        // https://fontawesome.com/icons/comments?style=regular
        // Regular icon : Comments
        val CommentsRegular = Regular(0xf086)

        // https://fontawesome.com/icons/comments-dollar?style=solid
        // Solid icon : CommentsDollar
        val CommentsDollar = Solid(0xf653)

        // https://fontawesome.com/icons/compact-disc?style=solid
        // Solid icon : CompactDisc
        val CompactDisc = Solid(0xf51f)

        // https://fontawesome.com/icons/compass?style=solid
        // Solid icon : Compass
        val Compass = Solid(0xf14e)

        // https://fontawesome.com/icons/compass?style=regular
        // Regular icon : Compass
        val CompassRegular = Regular(0xf14e)

        // https://fontawesome.com/icons/compress?style=solid
        // Solid icon : Compress
        val Compress = Solid(0xf066)

        // https://fontawesome.com/icons/compress-alt?style=solid
        // Solid icon : CompressAlt
        val CompressAlt = Solid(0xf422)

        // https://fontawesome.com/icons/compress-arrows-alt?style=solid
        // Solid icon : CompressArrowsAlt
        val CompressArrowsAlt = Solid(0xf78c)

        // https://fontawesome.com/icons/concierge-bell?style=solid
        // Solid icon : ConciergeBell
        val ConciergeBell = Solid(0xf562)

        // https://fontawesome.com/icons/confluence?style=brands
        // Brands icon : Confluence
        val Confluence = Brand(0xf78d)

        // https://fontawesome.com/icons/connectdevelop?style=brands
        // Brands icon : Connectdevelop
        val Connectdevelop = Brand(0xf20e)

        // https://fontawesome.com/icons/contao?style=brands
        // Brands icon : Contao
        val Contao = Brand(0xf26d)

        // https://fontawesome.com/icons/cookie?style=solid
        // Solid icon : Cookie
        val Cookie = Solid(0xf563)

        // https://fontawesome.com/icons/cookie-bite?style=solid
        // Solid icon : CookieBite
        val CookieBite = Solid(0xf564)

        // https://fontawesome.com/icons/copy?style=solid
        // Solid icon : Copy
        val Copy = Solid(0xf0c5)

        // https://fontawesome.com/icons/copy?style=regular
        // Regular icon : Copy
        val CopyRegular = Regular(0xf0c5)

        // https://fontawesome.com/icons/copyright?style=solid
        // Solid icon : Copyright
        val Copyright = Solid(0xf1f9)

        // https://fontawesome.com/icons/copyright?style=regular
        // Regular icon : Copyright
        val CopyrightRegular = Regular(0xf1f9)

        // https://fontawesome.com/icons/cotton-bureau?style=brands
        // Brands icon : CottonBureau
        val CottonBureau = Brand(0xf89e)

        // https://fontawesome.com/icons/couch?style=solid
        // Solid icon : Couch
        val Couch = Solid(0xf4b8)

        // https://fontawesome.com/icons/cpanel?style=brands
        // Brands icon : Cpanel
        val Cpanel = Brand(0xf388)

        // https://fontawesome.com/icons/creative-commons?style=brands
        // Brands icon : CreativeCommons
        val CreativeCommons = Brand(0xf25e)

        // https://fontawesome.com/icons/creative-commons-by?style=brands
        // Brands icon : CreativeCommonsBy
        val CreativeCommonsBy = Brand(0xf4e7)

        // https://fontawesome.com/icons/creative-commons-nc?style=brands
        // Brands icon : CreativeCommonsNc
        val CreativeCommonsNc = Brand(0xf4e8)

        // https://fontawesome.com/icons/creative-commons-nc-eu?style=brands
        // Brands icon : CreativeCommonsNcEu
        val CreativeCommonsNcEu = Brand(0xf4e9)

        // https://fontawesome.com/icons/creative-commons-nc-jp?style=brands
        // Brands icon : CreativeCommonsNcJp
        val CreativeCommonsNcJp = Brand(0xf4ea)

        // https://fontawesome.com/icons/creative-commons-nd?style=brands
        // Brands icon : CreativeCommonsNd
        val CreativeCommonsNd = Brand(0xf4eb)

        // https://fontawesome.com/icons/creative-commons-pd?style=brands
        // Brands icon : CreativeCommonsPd
        val CreativeCommonsPd = Brand(0xf4ec)

        // https://fontawesome.com/icons/creative-commons-pd-alt?style=brands
        // Brands icon : CreativeCommonsPdAlt
        val CreativeCommonsPdAlt = Brand(0xf4ed)

        // https://fontawesome.com/icons/creative-commons-remix?style=brands
        // Brands icon : CreativeCommonsRemix
        val CreativeCommonsRemix = Brand(0xf4ee)

        // https://fontawesome.com/icons/creative-commons-sa?style=brands
        // Brands icon : CreativeCommonsSa
        val CreativeCommonsSa = Brand(0xf4ef)

        // https://fontawesome.com/icons/creative-commons-sampling?style=brands
        // Brands icon : CreativeCommonsSampling
        val CreativeCommonsSampling = Brand(0xf4f0)

        // https://fontawesome.com/icons/creative-commons-sampling-plus?style=brands
        // Brands icon : CreativeCommonsSamplingPlus
        val CreativeCommonsSamplingPlus = Brand(0xf4f1)

        // https://fontawesome.com/icons/creative-commons-share?style=brands
        // Brands icon : CreativeCommonsShare
        val CreativeCommonsShare = Brand(0xf4f2)

        // https://fontawesome.com/icons/creative-commons-zero?style=brands
        // Brands icon : CreativeCommonsZero
        val CreativeCommonsZero = Brand(0xf4f3)

        // https://fontawesome.com/icons/credit-card?style=solid
        // Solid icon : CreditCard
        val CreditCard = Solid(0xf09d)

        // https://fontawesome.com/icons/credit-card?style=regular
        // Regular icon : CreditCard
        val CreditCardRegular = Regular(0xf09d)

        // https://fontawesome.com/icons/critical-role?style=brands
        // Brands icon : CriticalRole
        val CriticalRole = Brand(0xf6c9)

        // https://fontawesome.com/icons/crop?style=solid
        // Solid icon : Crop
        val Crop = Solid(0xf125)

        // https://fontawesome.com/icons/crop-alt?style=solid
        // Solid icon : CropAlt
        val CropAlt = Solid(0xf565)

        // https://fontawesome.com/icons/cross?style=solid
        // Solid icon : Cross
        val Cross = Solid(0xf654)

        // https://fontawesome.com/icons/crosshairs?style=solid
        // Solid icon : Crosshairs
        val Crosshairs = Solid(0xf05b)

        // https://fontawesome.com/icons/crow?style=solid
        // Solid icon : Crow
        val Crow = Solid(0xf520)

        // https://fontawesome.com/icons/crown?style=solid
        // Solid icon : Crown
        val Crown = Solid(0xf521)

        // https://fontawesome.com/icons/crutch?style=solid
        // Solid icon : Crutch
        val Crutch = Solid(0xf7f7)

        // https://fontawesome.com/icons/css3?style=brands
        // Brands icon : Css3
        val Css3 = Brand(0xf13c)

        // https://fontawesome.com/icons/css3-alt?style=brands
        // Brands icon : Css3Alt
        val Css3Alt = Brand(0xf38b)

        // https://fontawesome.com/icons/cube?style=solid
        // Solid icon : Cube
        val Cube = Solid(0xf1b2)

        // https://fontawesome.com/icons/cubes?style=solid
        // Solid icon : Cubes
        val Cubes = Solid(0xf1b3)

        // https://fontawesome.com/icons/cut?style=solid
        // Solid icon : Cut
        val Cut = Solid(0xf0c4)

        // https://fontawesome.com/icons/cuttlefish?style=brands
        // Brands icon : Cuttlefish
        val Cuttlefish = Brand(0xf38c)

        // https://fontawesome.com/icons/d-and-d?style=brands
        // Brands icon : DAndD
        val DAndD = Brand(0xf38d)

        // https://fontawesome.com/icons/d-and-d-beyond?style=brands
        // Brands icon : DAndDBeyond
        val DAndDBeyond = Brand(0xf6ca)

        // https://fontawesome.com/icons/dailymotion?style=brands
        // Brands icon : Dailymotion
        val Dailymotion = Brand(0xe052)

        // https://fontawesome.com/icons/dashcube?style=brands
        // Brands icon : Dashcube
        val Dashcube = Brand(0xf210)

        // https://fontawesome.com/icons/database?style=solid
        // Solid icon : Database
        val Database = Solid(0xf1c0)

        // https://fontawesome.com/icons/deaf?style=solid
        // Solid icon : Deaf
        val Deaf = Solid(0xf2a4)

        // https://fontawesome.com/icons/deezer?style=brands
        // Brands icon : Deezer
        val Deezer = Brand(0xe077)

        // https://fontawesome.com/icons/delicious?style=brands
        // Brands icon : Delicious
        val Delicious = Brand(0xf1a5)

        // https://fontawesome.com/icons/democrat?style=solid
        // Solid icon : Democrat
        val Democrat = Solid(0xf747)

        // https://fontawesome.com/icons/deploydog?style=brands
        // Brands icon : Deploydog
        val Deploydog = Brand(0xf38e)

        // https://fontawesome.com/icons/deskpro?style=brands
        // Brands icon : Deskpro
        val Deskpro = Brand(0xf38f)

        // https://fontawesome.com/icons/desktop?style=solid
        // Solid icon : Desktop
        val Desktop = Solid(0xf108)

        // https://fontawesome.com/icons/dev?style=brands
        // Brands icon : Dev
        val Dev = Brand(0xf6cc)

        // https://fontawesome.com/icons/deviantart?style=brands
        // Brands icon : Deviantart
        val Deviantart = Brand(0xf1bd)

        // https://fontawesome.com/icons/dharmachakra?style=solid
        // Solid icon : Dharmachakra
        val Dharmachakra = Solid(0xf655)

        // https://fontawesome.com/icons/dhl?style=brands
        // Brands icon : Dhl
        val Dhl = Brand(0xf790)

        // https://fontawesome.com/icons/diagnoses?style=solid
        // Solid icon : Diagnoses
        val Diagnoses = Solid(0xf470)

        // https://fontawesome.com/icons/diaspora?style=brands
        // Brands icon : Diaspora
        val Diaspora = Brand(0xf791)

        // https://fontawesome.com/icons/dice?style=solid
        // Solid icon : Dice
        val Dice = Solid(0xf522)

        // https://fontawesome.com/icons/dice-d20?style=solid
        // Solid icon : DiceD20
        val DiceD20 = Solid(0xf6cf)

        // https://fontawesome.com/icons/dice-d6?style=solid
        // Solid icon : DiceD6
        val DiceD6 = Solid(0xf6d1)

        // https://fontawesome.com/icons/dice-five?style=solid
        // Solid icon : DiceFive
        val DiceFive = Solid(0xf523)

        // https://fontawesome.com/icons/dice-four?style=solid
        // Solid icon : DiceFour
        val DiceFour = Solid(0xf524)

        // https://fontawesome.com/icons/dice-one?style=solid
        // Solid icon : DiceOne
        val DiceOne = Solid(0xf525)

        // https://fontawesome.com/icons/dice-six?style=solid
        // Solid icon : DiceSix
        val DiceSix = Solid(0xf526)

        // https://fontawesome.com/icons/dice-three?style=solid
        // Solid icon : DiceThree
        val DiceThree = Solid(0xf527)

        // https://fontawesome.com/icons/dice-two?style=solid
        // Solid icon : DiceTwo
        val DiceTwo = Solid(0xf528)

        // https://fontawesome.com/icons/digg?style=brands
        // Brands icon : Digg
        val Digg = Brand(0xf1a6)

        // https://fontawesome.com/icons/digital-ocean?style=brands
        // Brands icon : DigitalOcean
        val DigitalOcean = Brand(0xf391)

        // https://fontawesome.com/icons/digital-tachograph?style=solid
        // Solid icon : DigitalTachograph
        val DigitalTachograph = Solid(0xf566)

        // https://fontawesome.com/icons/directions?style=solid
        // Solid icon : Directions
        val Directions = Solid(0xf5eb)

        // https://fontawesome.com/icons/discord?style=brands
        // Brands icon : Discord
        val Discord = Brand(0xf392)

        // https://fontawesome.com/icons/discourse?style=brands
        // Brands icon : Discourse
        val Discourse = Brand(0xf393)

        // https://fontawesome.com/icons/disease?style=solid
        // Solid icon : Disease
        val Disease = Solid(0xf7fa)

        // https://fontawesome.com/icons/divide?style=solid
        // Solid icon : Divide
        val Divide = Solid(0xf529)

        // https://fontawesome.com/icons/dizzy?style=solid
        // Solid icon : Dizzy
        val Dizzy = Solid(0xf567)

        // https://fontawesome.com/icons/dizzy?style=regular
        // Regular icon : Dizzy
        val DizzyRegular = Regular(0xf567)

        // https://fontawesome.com/icons/dna?style=solid
        // Solid icon : Dna
        val Dna = Solid(0xf471)

        // https://fontawesome.com/icons/dochub?style=brands
        // Brands icon : Dochub
        val Dochub = Brand(0xf394)

        // https://fontawesome.com/icons/docker?style=brands
        // Brands icon : Docker
        val Docker = Brand(0xf395)

        // https://fontawesome.com/icons/dog?style=solid
        // Solid icon : Dog
        val Dog = Solid(0xf6d3)

        // https://fontawesome.com/icons/dollar-sign?style=solid
        // Solid icon : DollarSign
        val DollarSign = Solid(0xf155)

        // https://fontawesome.com/icons/dolly?style=solid
        // Solid icon : Dolly
        val Dolly = Solid(0xf472)

        // https://fontawesome.com/icons/dolly-flatbed?style=solid
        // Solid icon : DollyFlatbed
        val DollyFlatbed = Solid(0xf474)

        // https://fontawesome.com/icons/donate?style=solid
        // Solid icon : Donate
        val Donate = Solid(0xf4b9)

        // https://fontawesome.com/icons/door-closed?style=solid
        // Solid icon : DoorClosed
        val DoorClosed = Solid(0xf52a)

        // https://fontawesome.com/icons/door-open?style=solid
        // Solid icon : DoorOpen
        val DoorOpen = Solid(0xf52b)

        // https://fontawesome.com/icons/dot-circle?style=solid
        // Solid icon : DotCircle
        val DotCircle = Solid(0xf192)

        // https://fontawesome.com/icons/dot-circle?style=regular
        // Regular icon : DotCircle
        val DotCircleRegular = Regular(0xf192)

        // https://fontawesome.com/icons/dove?style=solid
        // Solid icon : Dove
        val Dove = Solid(0xf4ba)

        // https://fontawesome.com/icons/download?style=solid
        // Solid icon : Download
        val Download = Solid(0xf019)

        // https://fontawesome.com/icons/draft2digital?style=brands
        // Brands icon : Draft2digital
        val Draft2digital = Brand(0xf396)

        // https://fontawesome.com/icons/drafting-compass?style=solid
        // Solid icon : DraftingCompass
        val DraftingCompass = Solid(0xf568)

        // https://fontawesome.com/icons/dragon?style=solid
        // Solid icon : Dragon
        val Dragon = Solid(0xf6d5)

        // https://fontawesome.com/icons/draw-polygon?style=solid
        // Solid icon : DrawPolygon
        val DrawPolygon = Solid(0xf5ee)

        // https://fontawesome.com/icons/dribbble?style=brands
        // Brands icon : Dribbble
        val Dribbble = Brand(0xf17d)

        // https://fontawesome.com/icons/dribbble-square?style=brands
        // Brands icon : DribbbleSquare
        val DribbbleSquare = Brand(0xf397)

        // https://fontawesome.com/icons/dropbox?style=brands
        // Brands icon : Dropbox
        val Dropbox = Brand(0xf16b)

        // https://fontawesome.com/icons/drum?style=solid
        // Solid icon : Drum
        val Drum = Solid(0xf569)

        // https://fontawesome.com/icons/drum-steelpan?style=solid
        // Solid icon : DrumSteelpan
        val DrumSteelpan = Solid(0xf56a)

        // https://fontawesome.com/icons/drumstick-bite?style=solid
        // Solid icon : DrumstickBite
        val DrumstickBite = Solid(0xf6d7)

        // https://fontawesome.com/icons/drupal?style=brands
        // Brands icon : Drupal
        val Drupal = Brand(0xf1a9)

        // https://fontawesome.com/icons/dumbbell?style=solid
        // Solid icon : Dumbbell
        val Dumbbell = Solid(0xf44b)

        // https://fontawesome.com/icons/dumpster?style=solid
        // Solid icon : Dumpster
        val Dumpster = Solid(0xf793)

        // https://fontawesome.com/icons/dumpster-fire?style=solid
        // Solid icon : DumpsterFire
        val DumpsterFire = Solid(0xf794)

        // https://fontawesome.com/icons/dungeon?style=solid
        // Solid icon : Dungeon
        val Dungeon = Solid(0xf6d9)

        // https://fontawesome.com/icons/dyalog?style=brands
        // Brands icon : Dyalog
        val Dyalog = Brand(0xf399)

        // https://fontawesome.com/icons/earlybirds?style=brands
        // Brands icon : Earlybirds
        val Earlybirds = Brand(0xf39a)

        // https://fontawesome.com/icons/ebay?style=brands
        // Brands icon : Ebay
        val Ebay = Brand(0xf4f4)

        // https://fontawesome.com/icons/edge?style=brands
        // Brands icon : Edge
        val Edge = Brand(0xf282)

        // https://fontawesome.com/icons/edge-legacy?style=brands
        // Brands icon : EdgeLegacy
        val EdgeLegacy = Brand(0xe078)

        // https://fontawesome.com/icons/edit?style=solid
        // Solid icon : Edit
        val Edit = Solid(0xf044)

        // https://fontawesome.com/icons/edit?style=regular
        // Regular icon : Edit
        val EditRegular = Regular(0xf044)

        // https://fontawesome.com/icons/egg?style=solid
        // Solid icon : Egg
        val Egg = Solid(0xf7fb)

        // https://fontawesome.com/icons/eject?style=solid
        // Solid icon : Eject
        val Eject = Solid(0xf052)

        // https://fontawesome.com/icons/elementor?style=brands
        // Brands icon : Elementor
        val Elementor = Brand(0xf430)

        // https://fontawesome.com/icons/ellipsis-h?style=solid
        // Solid icon : EllipsisH
        val EllipsisH = Solid(0xf141)

        // https://fontawesome.com/icons/ellipsis-v?style=solid
        // Solid icon : EllipsisV
        val EllipsisV = Solid(0xf142)

        // https://fontawesome.com/icons/ello?style=brands
        // Brands icon : Ello
        val Ello = Brand(0xf5f1)

        // https://fontawesome.com/icons/ember?style=brands
        // Brands icon : Ember
        val Ember = Brand(0xf423)

        // https://fontawesome.com/icons/empire?style=brands
        // Brands icon : Empire
        val Empire = Brand(0xf1d1)

        // https://fontawesome.com/icons/envelope?style=solid
        // Solid icon : Envelope
        val Envelope = Solid(0xf0e0)

        // https://fontawesome.com/icons/envelope?style=regular
        // Regular icon : Envelope
        val EnvelopeRegular = Regular(0xf0e0)

        // https://fontawesome.com/icons/envelope-open?style=solid
        // Solid icon : EnvelopeOpen
        val EnvelopeOpen = Solid(0xf2b6)

        // https://fontawesome.com/icons/envelope-open?style=regular
        // Regular icon : EnvelopeOpen
        val EnvelopeOpenRegular = Regular(0xf2b6)

        // https://fontawesome.com/icons/envelope-open-text?style=solid
        // Solid icon : EnvelopeOpenText
        val EnvelopeOpenText = Solid(0xf658)

        // https://fontawesome.com/icons/envelope-square?style=solid
        // Solid icon : EnvelopeSquare
        val EnvelopeSquare = Solid(0xf199)

        // https://fontawesome.com/icons/envira?style=brands
        // Brands icon : Envira
        val Envira = Brand(0xf299)

        // https://fontawesome.com/icons/equals?style=solid
        // Solid icon : Equals
        val Equals = Solid(0xf52c)

        // https://fontawesome.com/icons/eraser?style=solid
        // Solid icon : Eraser
        val Eraser = Solid(0xf12d)

        // https://fontawesome.com/icons/erlang?style=brands
        // Brands icon : Erlang
        val Erlang = Brand(0xf39d)

        // https://fontawesome.com/icons/ethereum?style=brands
        // Brands icon : Ethereum
        val Ethereum = Brand(0xf42e)

        // https://fontawesome.com/icons/ethernet?style=solid
        // Solid icon : Ethernet
        val Ethernet = Solid(0xf796)

        // https://fontawesome.com/icons/etsy?style=brands
        // Brands icon : Etsy
        val Etsy = Brand(0xf2d7)

        // https://fontawesome.com/icons/euro-sign?style=solid
        // Solid icon : EuroSign
        val EuroSign = Solid(0xf153)

        // https://fontawesome.com/icons/evernote?style=brands
        // Brands icon : Evernote
        val Evernote = Brand(0xf839)

        // https://fontawesome.com/icons/exchange-alt?style=solid
        // Solid icon : ExchangeAlt
        val ExchangeAlt = Solid(0xf362)

        // https://fontawesome.com/icons/exclamation?style=solid
        // Solid icon : Exclamation
        val Exclamation = Solid(0xf12a)

        // https://fontawesome.com/icons/exclamation-circle?style=solid
        // Solid icon : ExclamationCircle
        val ExclamationCircle = Solid(0xf06a)

        // https://fontawesome.com/icons/exclamation-triangle?style=solid
        // Solid icon : ExclamationTriangle
        val ExclamationTriangle = Solid(0xf071)

        // https://fontawesome.com/icons/expand?style=solid
        // Solid icon : Expand
        val Expand = Solid(0xf065)

        // https://fontawesome.com/icons/expand-alt?style=solid
        // Solid icon : ExpandAlt
        val ExpandAlt = Solid(0xf424)

        // https://fontawesome.com/icons/expand-arrows-alt?style=solid
        // Solid icon : ExpandArrowsAlt
        val ExpandArrowsAlt = Solid(0xf31e)

        // https://fontawesome.com/icons/expeditedssl?style=brands
        // Brands icon : Expeditedssl
        val Expeditedssl = Brand(0xf23e)

        // https://fontawesome.com/icons/external-link-alt?style=solid
        // Solid icon : ExternalLinkAlt
        val ExternalLinkAlt = Solid(0xf35d)

        // https://fontawesome.com/icons/external-link-square-alt?style=solid
        // Solid icon : ExternalLinkSquareAlt
        val ExternalLinkSquareAlt = Solid(0xf360)

        // https://fontawesome.com/icons/eye?style=solid
        // Solid icon : Eye
        val Eye = Solid(0xf06e)

        // https://fontawesome.com/icons/eye?style=regular
        // Regular icon : Eye
        val EyeRegular = Regular(0xf06e)

        // https://fontawesome.com/icons/eye-dropper?style=solid
        // Solid icon : EyeDropper
        val EyeDropper = Solid(0xf1fb)

        // https://fontawesome.com/icons/eye-slash?style=solid
        // Solid icon : EyeSlash
        val EyeSlash = Solid(0xf070)

        // https://fontawesome.com/icons/eye-slash?style=regular
        // Regular icon : EyeSlash
        val EyeSlashRegular = Regular(0xf070)

        // https://fontawesome.com/icons/facebook?style=brands
        // Brands icon : Facebook
        val Facebook = Brand(0xf09a)

        // https://fontawesome.com/icons/facebook-f?style=brands
        // Brands icon : FacebookF
        val FacebookF = Brand(0xf39e)

        // https://fontawesome.com/icons/facebook-messenger?style=brands
        // Brands icon : FacebookMessenger
        val FacebookMessenger = Brand(0xf39f)

        // https://fontawesome.com/icons/facebook-square?style=brands
        // Brands icon : FacebookSquare
        val FacebookSquare = Brand(0xf082)

        // https://fontawesome.com/icons/fan?style=solid
        // Solid icon : Fan
        val Fan = Solid(0xf863)

        // https://fontawesome.com/icons/fantasy-flight-games?style=brands
        // Brands icon : FantasyFlightGames
        val FantasyFlightGames = Brand(0xf6dc)

        // https://fontawesome.com/icons/fast-backward?style=solid
        // Solid icon : FastBackward
        val FastBackward = Solid(0xf049)

        // https://fontawesome.com/icons/fast-forward?style=solid
        // Solid icon : FastForward
        val FastForward = Solid(0xf050)

        // https://fontawesome.com/icons/faucet?style=solid
        // Solid icon : Faucet
        val Faucet = Solid(0xe005)

        // https://fontawesome.com/icons/fax?style=solid
        // Solid icon : Fax
        val Fax = Solid(0xf1ac)

        // https://fontawesome.com/icons/feather?style=solid
        // Solid icon : Feather
        val Feather = Solid(0xf52d)

        // https://fontawesome.com/icons/feather-alt?style=solid
        // Solid icon : FeatherAlt
        val FeatherAlt = Solid(0xf56b)

        // https://fontawesome.com/icons/fedex?style=brands
        // Brands icon : Fedex
        val Fedex = Brand(0xf797)

        // https://fontawesome.com/icons/fedora?style=brands
        // Brands icon : Fedora
        val Fedora = Brand(0xf798)

        // https://fontawesome.com/icons/female?style=solid
        // Solid icon : Female
        val Female = Solid(0xf182)

        // https://fontawesome.com/icons/fighter-jet?style=solid
        // Solid icon : FighterJet
        val FighterJet = Solid(0xf0fb)

        // https://fontawesome.com/icons/figma?style=brands
        // Brands icon : Figma
        val Figma = Brand(0xf799)

        // https://fontawesome.com/icons/file?style=solid
        // Solid icon : File
        val File = Solid(0xf15b)

        // https://fontawesome.com/icons/file?style=regular
        // Regular icon : File
        val FileRegular = Regular(0xf15b)

        // https://fontawesome.com/icons/file-alt?style=solid
        // Solid icon : FileAlt
        val FileAlt = Solid(0xf15c)

        // https://fontawesome.com/icons/file-alt?style=regular
        // Regular icon : FileAlt
        val FileAltRegular = Regular(0xf15c)

        // https://fontawesome.com/icons/file-archive?style=solid
        // Solid icon : FileArchive
        val FileArchive = Solid(0xf1c6)

        // https://fontawesome.com/icons/file-archive?style=regular
        // Regular icon : FileArchive
        val FileArchiveRegular = Regular(0xf1c6)

        // https://fontawesome.com/icons/file-audio?style=solid
        // Solid icon : FileAudio
        val FileAudio = Solid(0xf1c7)

        // https://fontawesome.com/icons/file-audio?style=regular
        // Regular icon : FileAudio
        val FileAudioRegular = Regular(0xf1c7)

        // https://fontawesome.com/icons/file-code?style=solid
        // Solid icon : FileCode
        val FileCode = Solid(0xf1c9)

        // https://fontawesome.com/icons/file-code?style=regular
        // Regular icon : FileCode
        val FileCodeRegular = Regular(0xf1c9)

        // https://fontawesome.com/icons/file-contract?style=solid
        // Solid icon : FileContract
        val FileContract = Solid(0xf56c)

        // https://fontawesome.com/icons/file-csv?style=solid
        // Solid icon : FileCsv
        val FileCsv = Solid(0xf6dd)

        // https://fontawesome.com/icons/file-download?style=solid
        // Solid icon : FileDownload
        val FileDownload = Solid(0xf56d)

        // https://fontawesome.com/icons/file-excel?style=solid
        // Solid icon : FileExcel
        val FileExcel = Solid(0xf1c3)

        // https://fontawesome.com/icons/file-excel?style=regular
        // Regular icon : FileExcel
        val FileExcelRegular = Regular(0xf1c3)

        // https://fontawesome.com/icons/file-export?style=solid
        // Solid icon : FileExport
        val FileExport = Solid(0xf56e)

        // https://fontawesome.com/icons/file-image?style=solid
        // Solid icon : FileImage
        val FileImage = Solid(0xf1c5)

        // https://fontawesome.com/icons/file-image?style=regular
        // Regular icon : FileImage
        val FileImageRegular = Regular(0xf1c5)

        // https://fontawesome.com/icons/file-import?style=solid
        // Solid icon : FileImport
        val FileImport = Solid(0xf56f)

        // https://fontawesome.com/icons/file-invoice?style=solid
        // Solid icon : FileInvoice
        val FileInvoice = Solid(0xf570)

        // https://fontawesome.com/icons/file-invoice-dollar?style=solid
        // Solid icon : FileInvoiceDollar
        val FileInvoiceDollar = Solid(0xf571)

        // https://fontawesome.com/icons/file-medical?style=solid
        // Solid icon : FileMedical
        val FileMedical = Solid(0xf477)

        // https://fontawesome.com/icons/file-medical-alt?style=solid
        // Solid icon : FileMedicalAlt
        val FileMedicalAlt = Solid(0xf478)

        // https://fontawesome.com/icons/file-pdf?style=solid
        // Solid icon : FilePdf
        val FilePdf = Solid(0xf1c1)

        // https://fontawesome.com/icons/file-pdf?style=regular
        // Regular icon : FilePdf
        val FilePdfRegular = Regular(0xf1c1)

        // https://fontawesome.com/icons/file-powerpoint?style=solid
        // Solid icon : FilePowerpoint
        val FilePowerpoint = Solid(0xf1c4)

        // https://fontawesome.com/icons/file-powerpoint?style=regular
        // Regular icon : FilePowerpoint
        val FilePowerpointRegular = Regular(0xf1c4)

        // https://fontawesome.com/icons/file-prescription?style=solid
        // Solid icon : FilePrescription
        val FilePrescription = Solid(0xf572)

        // https://fontawesome.com/icons/file-signature?style=solid
        // Solid icon : FileSignature
        val FileSignature = Solid(0xf573)

        // https://fontawesome.com/icons/file-upload?style=solid
        // Solid icon : FileUpload
        val FileUpload = Solid(0xf574)

        // https://fontawesome.com/icons/file-video?style=solid
        // Solid icon : FileVideo
        val FileVideo = Solid(0xf1c8)

        // https://fontawesome.com/icons/file-video?style=regular
        // Regular icon : FileVideo
        val FileVideoRegular = Regular(0xf1c8)

        // https://fontawesome.com/icons/file-word?style=solid
        // Solid icon : FileWord
        val FileWord = Solid(0xf1c2)

        // https://fontawesome.com/icons/file-word?style=regular
        // Regular icon : FileWord
        val FileWordRegular = Regular(0xf1c2)

        // https://fontawesome.com/icons/fill?style=solid
        // Solid icon : Fill
        val Fill = Solid(0xf575)

        // https://fontawesome.com/icons/fill-drip?style=solid
        // Solid icon : FillDrip
        val FillDrip = Solid(0xf576)

        // https://fontawesome.com/icons/film?style=solid
        // Solid icon : Film
        val Film = Solid(0xf008)

        // https://fontawesome.com/icons/filter?style=solid
        // Solid icon : Filter
        val Filter = Solid(0xf0b0)

        // https://fontawesome.com/icons/fingerprint?style=solid
        // Solid icon : Fingerprint
        val Fingerprint = Solid(0xf577)

        // https://fontawesome.com/icons/fire?style=solid
        // Solid icon : Fire
        val Fire = Solid(0xf06d)

        // https://fontawesome.com/icons/fire-alt?style=solid
        // Solid icon : FireAlt
        val FireAlt = Solid(0xf7e4)

        // https://fontawesome.com/icons/fire-extinguisher?style=solid
        // Solid icon : FireExtinguisher
        val FireExtinguisher = Solid(0xf134)

        // https://fontawesome.com/icons/firefox?style=brands
        // Brands icon : Firefox
        val Firefox = Brand(0xf269)

        // https://fontawesome.com/icons/firefox-browser?style=brands
        // Brands icon : FirefoxBrowser
        val FirefoxBrowser = Brand(0xe007)

        // https://fontawesome.com/icons/first-aid?style=solid
        // Solid icon : FirstAid
        val FirstAid = Solid(0xf479)

        // https://fontawesome.com/icons/first-order?style=brands
        // Brands icon : FirstOrder
        val FirstOrder = Brand(0xf2b0)

        // https://fontawesome.com/icons/first-order-alt?style=brands
        // Brands icon : FirstOrderAlt
        val FirstOrderAlt = Brand(0xf50a)

        // https://fontawesome.com/icons/firstdraft?style=brands
        // Brands icon : Firstdraft
        val Firstdraft = Brand(0xf3a1)

        // https://fontawesome.com/icons/fish?style=solid
        // Solid icon : Fish
        val Fish = Solid(0xf578)

        // https://fontawesome.com/icons/fist-raised?style=solid
        // Solid icon : FistRaised
        val FistRaised = Solid(0xf6de)

        // https://fontawesome.com/icons/500px?style=brands
        // Brands icon : 500px
        val FiveHundredPX = Brand(0xf26e)

        // https://fontawesome.com/icons/flag?style=solid
        // Solid icon : Flag
        val Flag = Solid(0xf024)

        // https://fontawesome.com/icons/flag?style=regular
        // Regular icon : Flag
        val FlagRegular = Regular(0xf024)

        // https://fontawesome.com/icons/flag-checkered?style=solid
        // Solid icon : FlagCheckered
        val FlagCheckered = Solid(0xf11e)

        // https://fontawesome.com/icons/flag-usa?style=solid
        // Solid icon : FlagUsa
        val FlagUsa = Solid(0xf74d)

        // https://fontawesome.com/icons/flask?style=solid
        // Solid icon : Flask
        val Flask = Solid(0xf0c3)

        // https://fontawesome.com/icons/flickr?style=brands
        // Brands icon : Flickr
        val Flickr = Brand(0xf16e)

        // https://fontawesome.com/icons/flipboard?style=brands
        // Brands icon : Flipboard
        val Flipboard = Brand(0xf44d)

        // https://fontawesome.com/icons/flushed?style=solid
        // Solid icon : Flushed
        val Flushed = Solid(0xf579)

        // https://fontawesome.com/icons/flushed?style=regular
        // Regular icon : Flushed
        val FlushedRegular = Regular(0xf579)

        // https://fontawesome.com/icons/fly?style=brands
        // Brands icon : Fly
        val Fly = Brand(0xf417)

        // https://fontawesome.com/icons/folder?style=solid
        // Solid icon : Folder
        val Folder = Solid(0xf07b)

        // https://fontawesome.com/icons/folder?style=regular
        // Regular icon : Folder
        val FolderRegular = Regular(0xf07b)

        // https://fontawesome.com/icons/folder-minus?style=solid
        // Solid icon : FolderMinus
        val FolderMinus = Solid(0xf65d)

        // https://fontawesome.com/icons/folder-open?style=solid
        // Solid icon : FolderOpen
        val FolderOpen = Solid(0xf07c)

        // https://fontawesome.com/icons/folder-open?style=regular
        // Regular icon : FolderOpen
        val FolderOpenRegular = Regular(0xf07c)

        // https://fontawesome.com/icons/folder-plus?style=solid
        // Solid icon : FolderPlus
        val FolderPlus = Solid(0xf65e)

        // https://fontawesome.com/icons/font?style=solid
        // Solid icon : Font
        val Font = Solid(0xf031)

        // https://fontawesome.com/icons/font-awesome?style=brands
        // Brands icon : FontAwesome
        val FontAwesome = Brand(0xf2b4)

        // https://fontawesome.com/icons/font-awesome-alt?style=brands
        // Brands icon : FontAwesomeAlt
        val FontAwesomeAlt = Brand(0xf35c)

        // https://fontawesome.com/icons/font-awesome-flag?style=brands
        // Brands icon : FontAwesomeFlag
        val FontAwesomeFlag = Brand(0xf425)

        // https://fontawesome.com/icons/fonticons?style=brands
        // Brands icon : Fonticons
        val Fonticons = Brand(0xf280)

        // https://fontawesome.com/icons/fonticons-fi?style=brands
        // Brands icon : FonticonsFi
        val FonticonsFi = Brand(0xf3a2)

        // https://fontawesome.com/icons/football-ball?style=solid
        // Solid icon : FootballBall
        val FootballBall = Solid(0xf44e)

        // https://fontawesome.com/icons/fort-awesome?style=brands
        // Brands icon : FortAwesome
        val FortAwesome = Brand(0xf286)

        // https://fontawesome.com/icons/fort-awesome-alt?style=brands
        // Brands icon : FortAwesomeAlt
        val FortAwesomeAlt = Brand(0xf3a3)

        // https://fontawesome.com/icons/forumbee?style=brands
        // Brands icon : Forumbee
        val Forumbee = Brand(0xf211)

        // https://fontawesome.com/icons/forward?style=solid
        // Solid icon : Forward
        val Forward = Solid(0xf04e)

        // https://fontawesome.com/icons/foursquare?style=brands
        // Brands icon : Foursquare
        val Foursquare = Brand(0xf180)

        // https://fontawesome.com/icons/free-code-camp?style=brands
        // Brands icon : FreeCodeCamp
        val FreeCodeCamp = Brand(0xf2c5)

        // https://fontawesome.com/icons/freebsd?style=brands
        // Brands icon : Freebsd
        val Freebsd = Brand(0xf3a4)

        // https://fontawesome.com/icons/frog?style=solid
        // Solid icon : Frog
        val Frog = Solid(0xf52e)

        // https://fontawesome.com/icons/frown?style=solid
        // Solid icon : Frown
        val Frown = Solid(0xf119)

        // https://fontawesome.com/icons/frown?style=regular
        // Regular icon : Frown
        val FrownRegular = Regular(0xf119)

        // https://fontawesome.com/icons/frown-open?style=solid
        // Solid icon : FrownOpen
        val FrownOpen = Solid(0xf57a)

        // https://fontawesome.com/icons/frown-open?style=regular
        // Regular icon : FrownOpen
        val FrownOpenRegular = Regular(0xf57a)

        // https://fontawesome.com/icons/fulcrum?style=brands
        // Brands icon : Fulcrum
        val Fulcrum = Brand(0xf50b)

        // https://fontawesome.com/icons/funnel-dollar?style=solid
        // Solid icon : FunnelDollar
        val FunnelDollar = Solid(0xf662)

        // https://fontawesome.com/icons/futbol?style=solid
        // Solid icon : Futbol
        val Futbol = Solid(0xf1e3)

        // https://fontawesome.com/icons/futbol?style=regular
        // Regular icon : Futbol
        val FutbolRegular = Regular(0xf1e3)

        // https://fontawesome.com/icons/galactic-republic?style=brands
        // Brands icon : GalacticRepublic
        val GalacticRepublic = Brand(0xf50c)

        // https://fontawesome.com/icons/galactic-senate?style=brands
        // Brands icon : GalacticSenate
        val GalacticSenate = Brand(0xf50d)

        // https://fontawesome.com/icons/gamepad?style=solid
        // Solid icon : Gamepad
        val Gamepad = Solid(0xf11b)

        // https://fontawesome.com/icons/gas-pump?style=solid
        // Solid icon : GasPump
        val GasPump = Solid(0xf52f)

        // https://fontawesome.com/icons/gavel?style=solid
        // Solid icon : Gavel
        val Gavel = Solid(0xf0e3)

        // https://fontawesome.com/icons/gem?style=solid
        // Solid icon : Gem
        val Gem = Solid(0xf3a5)

        // https://fontawesome.com/icons/gem?style=regular
        // Regular icon : Gem
        val GemRegular = Regular(0xf3a5)

        // https://fontawesome.com/icons/genderless?style=solid
        // Solid icon : Genderless
        val Genderless = Solid(0xf22d)

        // https://fontawesome.com/icons/get-pocket?style=brands
        // Brands icon : GetPocket
        val GetPocket = Brand(0xf265)

        // https://fontawesome.com/icons/gg?style=brands
        // Brands icon : Gg
        val Gg = Brand(0xf260)

        // https://fontawesome.com/icons/gg-circle?style=brands
        // Brands icon : GgCircle
        val GgCircle = Brand(0xf261)

        // https://fontawesome.com/icons/ghost?style=solid
        // Solid icon : Ghost
        val Ghost = Solid(0xf6e2)

        // https://fontawesome.com/icons/gift?style=solid
        // Solid icon : Gift
        val Gift = Solid(0xf06b)

        // https://fontawesome.com/icons/gifts?style=solid
        // Solid icon : Gifts
        val Gifts = Solid(0xf79c)

        // https://fontawesome.com/icons/git?style=brands
        // Brands icon : Git
        val Git = Brand(0xf1d3)

        // https://fontawesome.com/icons/git-alt?style=brands
        // Brands icon : GitAlt
        val GitAlt = Brand(0xf841)

        // https://fontawesome.com/icons/git-square?style=brands
        // Brands icon : GitSquare
        val GitSquare = Brand(0xf1d2)

        // https://fontawesome.com/icons/github?style=brands
        // Brands icon : Github
        val Github = Brand(0xf09b)

        // https://fontawesome.com/icons/github-alt?style=brands
        // Brands icon : GithubAlt
        val GithubAlt = Brand(0xf113)

        // https://fontawesome.com/icons/github-square?style=brands
        // Brands icon : GithubSquare
        val GithubSquare = Brand(0xf092)

        // https://fontawesome.com/icons/gitkraken?style=brands
        // Brands icon : Gitkraken
        val Gitkraken = Brand(0xf3a6)

        // https://fontawesome.com/icons/gitlab?style=brands
        // Brands icon : Gitlab
        val Gitlab = Brand(0xf296)

        // https://fontawesome.com/icons/gitter?style=brands
        // Brands icon : Gitter
        val Gitter = Brand(0xf426)

        // https://fontawesome.com/icons/glass-cheers?style=solid
        // Solid icon : GlassCheers
        val GlassCheers = Solid(0xf79f)

        // https://fontawesome.com/icons/glass-martini?style=solid
        // Solid icon : GlassMartini
        val GlassMartini = Solid(0xf000)

        // https://fontawesome.com/icons/glass-martini-alt?style=solid
        // Solid icon : GlassMartiniAlt
        val GlassMartiniAlt = Solid(0xf57b)

        // https://fontawesome.com/icons/glass-whiskey?style=solid
        // Solid icon : GlassWhiskey
        val GlassWhiskey = Solid(0xf7a0)

        // https://fontawesome.com/icons/glasses?style=solid
        // Solid icon : Glasses
        val Glasses = Solid(0xf530)

        // https://fontawesome.com/icons/glide?style=brands
        // Brands icon : Glide
        val Glide = Brand(0xf2a5)

        // https://fontawesome.com/icons/glide-g?style=brands
        // Brands icon : GlideG
        val GlideG = Brand(0xf2a6)

        // https://fontawesome.com/icons/globe?style=solid
        // Solid icon : Globe
        val Globe = Solid(0xf0ac)

        // https://fontawesome.com/icons/globe-africa?style=solid
        // Solid icon : GlobeAfrica
        val GlobeAfrica = Solid(0xf57c)

        // https://fontawesome.com/icons/globe-americas?style=solid
        // Solid icon : GlobeAmericas
        val GlobeAmericas = Solid(0xf57d)

        // https://fontawesome.com/icons/globe-asia?style=solid
        // Solid icon : GlobeAsia
        val GlobeAsia = Solid(0xf57e)

        // https://fontawesome.com/icons/globe-europe?style=solid
        // Solid icon : GlobeEurope
        val GlobeEurope = Solid(0xf7a2)

        // https://fontawesome.com/icons/gofore?style=brands
        // Brands icon : Gofore
        val Gofore = Brand(0xf3a7)

        // https://fontawesome.com/icons/golf-ball?style=solid
        // Solid icon : GolfBall
        val GolfBall = Solid(0xf450)

        // https://fontawesome.com/icons/goodreads?style=brands
        // Brands icon : Goodreads
        val Goodreads = Brand(0xf3a8)

        // https://fontawesome.com/icons/goodreads-g?style=brands
        // Brands icon : GoodreadsG
        val GoodreadsG = Brand(0xf3a9)

        // https://fontawesome.com/icons/google?style=brands
        // Brands icon : Google
        val Google = Brand(0xf1a0)

        // https://fontawesome.com/icons/google-drive?style=brands
        // Brands icon : GoogleDrive
        val GoogleDrive = Brand(0xf3aa)

        // https://fontawesome.com/icons/google-pay?style=brands
        // Brands icon : GooglePay
        val GooglePay = Brand(0xe079)

        // https://fontawesome.com/icons/google-play?style=brands
        // Brands icon : GooglePlay
        val GooglePlay = Brand(0xf3ab)

        // https://fontawesome.com/icons/google-plus?style=brands
        // Brands icon : GooglePlus
        val GooglePlus = Brand(0xf2b3)

        // https://fontawesome.com/icons/google-plus-g?style=brands
        // Brands icon : GooglePlusG
        val GooglePlusG = Brand(0xf0d5)

        // https://fontawesome.com/icons/google-plus-square?style=brands
        // Brands icon : GooglePlusSquare
        val GooglePlusSquare = Brand(0xf0d4)

        // https://fontawesome.com/icons/google-wallet?style=brands
        // Brands icon : GoogleWallet
        val GoogleWallet = Brand(0xf1ee)

        // https://fontawesome.com/icons/gopuram?style=solid
        // Solid icon : Gopuram
        val Gopuram = Solid(0xf664)

        // https://fontawesome.com/icons/graduation-cap?style=solid
        // Solid icon : GraduationCap
        val GraduationCap = Solid(0xf19d)

        // https://fontawesome.com/icons/gratipay?style=brands
        // Brands icon : Gratipay
        val Gratipay = Brand(0xf184)

        // https://fontawesome.com/icons/grav?style=brands
        // Brands icon : Grav
        val Grav = Brand(0xf2d6)

        // https://fontawesome.com/icons/greater-than?style=solid
        // Solid icon : GreaterThan
        val GreaterThan = Solid(0xf531)

        // https://fontawesome.com/icons/greater-than-equal?style=solid
        // Solid icon : GreaterThanEqual
        val GreaterThanEqual = Solid(0xf532)

        // https://fontawesome.com/icons/grimace?style=solid
        // Solid icon : Grimace
        val Grimace = Solid(0xf57f)

        // https://fontawesome.com/icons/grimace?style=regular
        // Regular icon : Grimace
        val GrimaceRegular = Regular(0xf57f)

        // https://fontawesome.com/icons/grin?style=solid
        // Solid icon : Grin
        val Grin = Solid(0xf580)

        // https://fontawesome.com/icons/grin?style=regular
        // Regular icon : Grin
        val GrinRegular = Regular(0xf580)

        // https://fontawesome.com/icons/grin-alt?style=solid
        // Solid icon : GrinAlt
        val GrinAlt = Solid(0xf581)

        // https://fontawesome.com/icons/grin-alt?style=regular
        // Regular icon : GrinAlt
        val GrinAltRegular = Regular(0xf581)

        // https://fontawesome.com/icons/grin-beam?style=solid
        // Solid icon : GrinBeam
        val GrinBeam = Solid(0xf582)

        // https://fontawesome.com/icons/grin-beam?style=regular
        // Regular icon : GrinBeam
        val GrinBeamRegular = Regular(0xf582)

        // https://fontawesome.com/icons/grin-beam-sweat?style=solid
        // Solid icon : GrinBeamSweat
        val GrinBeamSweat = Solid(0xf583)

        // https://fontawesome.com/icons/grin-beam-sweat?style=regular
        // Regular icon : GrinBeamSweat
        val GrinBeamSweatRegular = Regular(0xf583)

        // https://fontawesome.com/icons/grin-hearts?style=solid
        // Solid icon : GrinHearts
        val GrinHearts = Solid(0xf584)

        // https://fontawesome.com/icons/grin-hearts?style=regular
        // Regular icon : GrinHearts
        val GrinHeartsRegular = Regular(0xf584)

        // https://fontawesome.com/icons/grin-squint?style=solid
        // Solid icon : GrinSquint
        val GrinSquint = Solid(0xf585)

        // https://fontawesome.com/icons/grin-squint?style=regular
        // Regular icon : GrinSquint
        val GrinSquintRegular = Regular(0xf585)

        // https://fontawesome.com/icons/grin-squint-tears?style=solid
        // Solid icon : GrinSquintTears
        val GrinSquintTears = Solid(0xf586)

        // https://fontawesome.com/icons/grin-squint-tears?style=regular
        // Regular icon : GrinSquintTears
        val GrinSquintTearsRegular = Regular(0xf586)

        // https://fontawesome.com/icons/grin-stars?style=solid
        // Solid icon : GrinStars
        val GrinStars = Solid(0xf587)

        // https://fontawesome.com/icons/grin-stars?style=regular
        // Regular icon : GrinStars
        val GrinStarsRegular = Regular(0xf587)

        // https://fontawesome.com/icons/grin-tears?style=solid
        // Solid icon : GrinTears
        val GrinTears = Solid(0xf588)

        // https://fontawesome.com/icons/grin-tears?style=regular
        // Regular icon : GrinTears
        val GrinTearsRegular = Regular(0xf588)

        // https://fontawesome.com/icons/grin-tongue?style=solid
        // Solid icon : GrinTongue
        val GrinTongue = Solid(0xf589)

        // https://fontawesome.com/icons/grin-tongue?style=regular
        // Regular icon : GrinTongue
        val GrinTongueRegular = Regular(0xf589)

        // https://fontawesome.com/icons/grin-tongue-squint?style=solid
        // Solid icon : GrinTongueSquint
        val GrinTongueSquint = Solid(0xf58a)

        // https://fontawesome.com/icons/grin-tongue-squint?style=regular
        // Regular icon : GrinTongueSquint
        val GrinTongueSquintRegular = Regular(0xf58a)

        // https://fontawesome.com/icons/grin-tongue-wink?style=solid
        // Solid icon : GrinTongueWink
        val GrinTongueWink = Solid(0xf58b)

        // https://fontawesome.com/icons/grin-tongue-wink?style=regular
        // Regular icon : GrinTongueWink
        val GrinTongueWinkRegular = Regular(0xf58b)

        // https://fontawesome.com/icons/grin-wink?style=solid
        // Solid icon : GrinWink
        val GrinWink = Solid(0xf58c)

        // https://fontawesome.com/icons/grin-wink?style=regular
        // Regular icon : GrinWink
        val GrinWinkRegular = Regular(0xf58c)

        // https://fontawesome.com/icons/grip-horizontal?style=solid
        // Solid icon : GripHorizontal
        val GripHorizontal = Solid(0xf58d)

        // https://fontawesome.com/icons/grip-lines?style=solid
        // Solid icon : GripLines
        val GripLines = Solid(0xf7a4)

        // https://fontawesome.com/icons/grip-lines-vertical?style=solid
        // Solid icon : GripLinesVertical
        val GripLinesVertical = Solid(0xf7a5)

        // https://fontawesome.com/icons/grip-vertical?style=solid
        // Solid icon : GripVertical
        val GripVertical = Solid(0xf58e)

        // https://fontawesome.com/icons/gripfire?style=brands
        // Brands icon : Gripfire
        val Gripfire = Brand(0xf3ac)

        // https://fontawesome.com/icons/grunt?style=brands
        // Brands icon : Grunt
        val Grunt = Brand(0xf3ad)

        // https://fontawesome.com/icons/guilded?style=brands
        // Brands icon : Guilded
        val Guilded = Brand(0xe07e)

        // https://fontawesome.com/icons/guitar?style=solid
        // Solid icon : Guitar
        val Guitar = Solid(0xf7a6)

        // https://fontawesome.com/icons/gulp?style=brands
        // Brands icon : Gulp
        val Gulp = Brand(0xf3ae)

        // https://fontawesome.com/icons/h-square?style=solid
        // Solid icon : HSquare
        val HSquare = Solid(0xf0fd)

        // https://fontawesome.com/icons/hacker-news?style=brands
        // Brands icon : HackerNews
        val HackerNews = Brand(0xf1d4)

        // https://fontawesome.com/icons/hacker-news-square?style=brands
        // Brands icon : HackerNewsSquare
        val HackerNewsSquare = Brand(0xf3af)

        // https://fontawesome.com/icons/hackerrank?style=brands
        // Brands icon : Hackerrank
        val Hackerrank = Brand(0xf5f7)

        // https://fontawesome.com/icons/hamburger?style=solid
        // Solid icon : Hamburger
        val Hamburger = Solid(0xf805)

        // https://fontawesome.com/icons/hammer?style=solid
        // Solid icon : Hammer
        val Hammer = Solid(0xf6e3)

        // https://fontawesome.com/icons/hamsa?style=solid
        // Solid icon : Hamsa
        val Hamsa = Solid(0xf665)

        // https://fontawesome.com/icons/hand-holding?style=solid
        // Solid icon : HandHolding
        val HandHolding = Solid(0xf4bd)

        // https://fontawesome.com/icons/hand-holding-heart?style=solid
        // Solid icon : HandHoldingHeart
        val HandHoldingHeart = Solid(0xf4be)

        // https://fontawesome.com/icons/hand-holding-medical?style=solid
        // Solid icon : HandHoldingMedical
        val HandHoldingMedical = Solid(0xe05c)

        // https://fontawesome.com/icons/hand-holding-usd?style=solid
        // Solid icon : HandHoldingUsd
        val HandHoldingUsd = Solid(0xf4c0)

        // https://fontawesome.com/icons/hand-holding-water?style=solid
        // Solid icon : HandHoldingWater
        val HandHoldingWater = Solid(0xf4c1)

        // https://fontawesome.com/icons/hand-lizard?style=solid
        // Solid icon : HandLizard
        val HandLizard = Solid(0xf258)

        // https://fontawesome.com/icons/hand-lizard?style=regular
        // Regular icon : HandLizard
        val HandLizardRegular = Regular(0xf258)

        // https://fontawesome.com/icons/hand-middle-finger?style=solid
        // Solid icon : HandMiddleFinger
        val HandMiddleFinger = Solid(0xf806)

        // https://fontawesome.com/icons/hand-paper?style=solid
        // Solid icon : HandPaper
        val HandPaper = Solid(0xf256)

        // https://fontawesome.com/icons/hand-paper?style=regular
        // Regular icon : HandPaper
        val HandPaperRegular = Regular(0xf256)

        // https://fontawesome.com/icons/hand-peace?style=solid
        // Solid icon : HandPeace
        val HandPeace = Solid(0xf25b)

        // https://fontawesome.com/icons/hand-peace?style=regular
        // Regular icon : HandPeace
        val HandPeaceRegular = Regular(0xf25b)

        // https://fontawesome.com/icons/hand-point-down?style=solid
        // Solid icon : HandPointDown
        val HandPointDown = Solid(0xf0a7)

        // https://fontawesome.com/icons/hand-point-down?style=regular
        // Regular icon : HandPointDown
        val HandPointDownRegular = Regular(0xf0a7)

        // https://fontawesome.com/icons/hand-point-left?style=solid
        // Solid icon : HandPointLeft
        val HandPointLeft = Solid(0xf0a5)

        // https://fontawesome.com/icons/hand-point-left?style=regular
        // Regular icon : HandPointLeft
        val HandPointLeftRegular = Regular(0xf0a5)

        // https://fontawesome.com/icons/hand-point-right?style=solid
        // Solid icon : HandPointRight
        val HandPointRight = Solid(0xf0a4)

        // https://fontawesome.com/icons/hand-point-right?style=regular
        // Regular icon : HandPointRight
        val HandPointRightRegular = Regular(0xf0a4)

        // https://fontawesome.com/icons/hand-point-up?style=solid
        // Solid icon : HandPointUp
        val HandPointUp = Solid(0xf0a6)

        // https://fontawesome.com/icons/hand-point-up?style=regular
        // Regular icon : HandPointUp
        val HandPointUpRegular = Regular(0xf0a6)

        // https://fontawesome.com/icons/hand-pointer?style=solid
        // Solid icon : HandPointer
        val HandPointer = Solid(0xf25a)

        // https://fontawesome.com/icons/hand-pointer?style=regular
        // Regular icon : HandPointer
        val HandPointerRegular = Regular(0xf25a)

        // https://fontawesome.com/icons/hand-rock?style=solid
        // Solid icon : HandRock
        val HandRock = Solid(0xf255)

        // https://fontawesome.com/icons/hand-rock?style=regular
        // Regular icon : HandRock
        val HandRockRegular = Regular(0xf255)

        // https://fontawesome.com/icons/hand-scissors?style=solid
        // Solid icon : HandScissors
        val HandScissors = Solid(0xf257)

        // https://fontawesome.com/icons/hand-scissors?style=regular
        // Regular icon : HandScissors
        val HandScissorsRegular = Regular(0xf257)

        // https://fontawesome.com/icons/hand-sparkles?style=solid
        // Solid icon : HandSparkles
        val HandSparkles = Solid(0xe05d)

        // https://fontawesome.com/icons/hand-spock?style=solid
        // Solid icon : HandSpock
        val HandSpock = Solid(0xf259)

        // https://fontawesome.com/icons/hand-spock?style=regular
        // Regular icon : HandSpock
        val HandSpockRegular = Regular(0xf259)

        // https://fontawesome.com/icons/hands?style=solid
        // Solid icon : Hands
        val Hands = Solid(0xf4c2)

        // https://fontawesome.com/icons/hands-helping?style=solid
        // Solid icon : HandsHelping
        val HandsHelping = Solid(0xf4c4)

        // https://fontawesome.com/icons/hands-wash?style=solid
        // Solid icon : HandsWash
        val HandsWash = Solid(0xe05e)

        // https://fontawesome.com/icons/handshake?style=solid
        // Solid icon : Handshake
        val Handshake = Solid(0xf2b5)

        // https://fontawesome.com/icons/handshake?style=regular
        // Regular icon : Handshake
        val HandshakeRegular = Regular(0xf2b5)

        // https://fontawesome.com/icons/handshake-alt-slash?style=solid
        // Solid icon : HandshakeAltSlash
        val HandshakeAltSlash = Solid(0xe05f)

        // https://fontawesome.com/icons/handshake-slash?style=solid
        // Solid icon : HandshakeSlash
        val HandshakeSlash = Solid(0xe060)

        // https://fontawesome.com/icons/hanukiah?style=solid
        // Solid icon : Hanukiah
        val Hanukiah = Solid(0xf6e6)

        // https://fontawesome.com/icons/hard-hat?style=solid
        // Solid icon : HardHat
        val HardHat = Solid(0xf807)

        // https://fontawesome.com/icons/hashtag?style=solid
        // Solid icon : Hashtag
        val Hashtag = Solid(0xf292)

        // https://fontawesome.com/icons/hat-cowboy?style=solid
        // Solid icon : HatCowboy
        val HatCowboy = Solid(0xf8c0)

        // https://fontawesome.com/icons/hat-cowboy-side?style=solid
        // Solid icon : HatCowboySide
        val HatCowboySide = Solid(0xf8c1)

        // https://fontawesome.com/icons/hat-wizard?style=solid
        // Solid icon : HatWizard
        val HatWizard = Solid(0xf6e8)

        // https://fontawesome.com/icons/hdd?style=solid
        // Solid icon : Hdd
        val Hdd = Solid(0xf0a0)

        // https://fontawesome.com/icons/hdd?style=regular
        // Regular icon : Hdd
        val HddRegular = Regular(0xf0a0)

        // https://fontawesome.com/icons/head-side-cough?style=solid
        // Solid icon : HeadSideCough
        val HeadSideCough = Solid(0xe061)

        // https://fontawesome.com/icons/head-side-cough-slash?style=solid
        // Solid icon : HeadSideCoughSlash
        val HeadSideCoughSlash = Solid(0xe062)

        // https://fontawesome.com/icons/head-side-mask?style=solid
        // Solid icon : HeadSideMask
        val HeadSideMask = Solid(0xe063)

        // https://fontawesome.com/icons/head-side-virus?style=solid
        // Solid icon : HeadSideVirus
        val HeadSideVirus = Solid(0xe064)

        // https://fontawesome.com/icons/heading?style=solid
        // Solid icon : Heading
        val Heading = Solid(0xf1dc)

        // https://fontawesome.com/icons/headphones?style=solid
        // Solid icon : Headphones
        val Headphones = Solid(0xf025)

        // https://fontawesome.com/icons/headphones-alt?style=solid
        // Solid icon : HeadphonesAlt
        val HeadphonesAlt = Solid(0xf58f)

        // https://fontawesome.com/icons/headset?style=solid
        // Solid icon : Headset
        val Headset = Solid(0xf590)

        // https://fontawesome.com/icons/heart?style=solid
        // Solid icon : Heart
        val Heart = Solid(0xf004)

        // https://fontawesome.com/icons/heart?style=regular
        // Regular icon : Heart
        val HeartRegular = Regular(0xf004)

        // https://fontawesome.com/icons/heart-broken?style=solid
        // Solid icon : HeartBroken
        val HeartBroken = Solid(0xf7a9)

        // https://fontawesome.com/icons/heartbeat?style=solid
        // Solid icon : Heartbeat
        val Heartbeat = Solid(0xf21e)

        // https://fontawesome.com/icons/helicopter?style=solid
        // Solid icon : Helicopter
        val Helicopter = Solid(0xf533)

        // https://fontawesome.com/icons/highlighter?style=solid
        // Solid icon : Highlighter
        val Highlighter = Solid(0xf591)

        // https://fontawesome.com/icons/hiking?style=solid
        // Solid icon : Hiking
        val Hiking = Solid(0xf6ec)

        // https://fontawesome.com/icons/hippo?style=solid
        // Solid icon : Hippo
        val Hippo = Solid(0xf6ed)

        // https://fontawesome.com/icons/hips?style=brands
        // Brands icon : Hips
        val Hips = Brand(0xf452)

        // https://fontawesome.com/icons/hire-a-helper?style=brands
        // Brands icon : HireAHelper
        val HireAHelper = Brand(0xf3b0)

        // https://fontawesome.com/icons/history?style=solid
        // Solid icon : History
        val History = Solid(0xf1da)

        // https://fontawesome.com/icons/hive?style=brands
        // Brands icon : Hive
        val Hive = Brand(0xe07f)

        // https://fontawesome.com/icons/hockey-puck?style=solid
        // Solid icon : HockeyPuck
        val HockeyPuck = Solid(0xf453)

        // https://fontawesome.com/icons/holly-berry?style=solid
        // Solid icon : HollyBerry
        val HollyBerry = Solid(0xf7aa)

        // https://fontawesome.com/icons/home?style=solid
        // Solid icon : Home
        val Home = Solid(0xf015)

        // https://fontawesome.com/icons/hooli?style=brands
        // Brands icon : Hooli
        val Hooli = Brand(0xf427)

        // https://fontawesome.com/icons/hornbill?style=brands
        // Brands icon : Hornbill
        val Hornbill = Brand(0xf592)

        // https://fontawesome.com/icons/horse?style=solid
        // Solid icon : Horse
        val Horse = Solid(0xf6f0)

        // https://fontawesome.com/icons/horse-head?style=solid
        // Solid icon : HorseHead
        val HorseHead = Solid(0xf7ab)

        // https://fontawesome.com/icons/hospital?style=solid
        // Solid icon : Hospital
        val Hospital = Solid(0xf0f8)

        // https://fontawesome.com/icons/hospital?style=regular
        // Regular icon : Hospital
        val HospitalRegular = Regular(0xf0f8)

        // https://fontawesome.com/icons/hospital-alt?style=solid
        // Solid icon : HospitalAlt
        val HospitalAlt = Solid(0xf47d)

        // https://fontawesome.com/icons/hospital-symbol?style=solid
        // Solid icon : HospitalSymbol
        val HospitalSymbol = Solid(0xf47e)

        // https://fontawesome.com/icons/hospital-user?style=solid
        // Solid icon : HospitalUser
        val HospitalUser = Solid(0xf80d)

        // https://fontawesome.com/icons/hot-tub?style=solid
        // Solid icon : HotTub
        val HotTub = Solid(0xf593)

        // https://fontawesome.com/icons/hotdog?style=solid
        // Solid icon : Hotdog
        val Hotdog = Solid(0xf80f)

        // https://fontawesome.com/icons/hotel?style=solid
        // Solid icon : Hotel
        val Hotel = Solid(0xf594)

        // https://fontawesome.com/icons/hotjar?style=brands
        // Brands icon : Hotjar
        val Hotjar = Brand(0xf3b1)

        // https://fontawesome.com/icons/hourglass?style=solid
        // Solid icon : Hourglass
        val Hourglass = Solid(0xf254)

        // https://fontawesome.com/icons/hourglass?style=regular
        // Regular icon : Hourglass
        val HourglassRegular = Regular(0xf254)

        // https://fontawesome.com/icons/hourglass-end?style=solid
        // Solid icon : HourglassEnd
        val HourglassEnd = Solid(0xf253)

        // https://fontawesome.com/icons/hourglass-half?style=solid
        // Solid icon : HourglassHalf
        val HourglassHalf = Solid(0xf252)

        // https://fontawesome.com/icons/hourglass-start?style=solid
        // Solid icon : HourglassStart
        val HourglassStart = Solid(0xf251)

        // https://fontawesome.com/icons/house-damage?style=solid
        // Solid icon : HouseDamage
        val HouseDamage = Solid(0xf6f1)

        // https://fontawesome.com/icons/house-user?style=solid
        // Solid icon : HouseUser
        val HouseUser = Solid(0xe065)

        // https://fontawesome.com/icons/houzz?style=brands
        // Brands icon : Houzz
        val Houzz = Brand(0xf27c)

        // https://fontawesome.com/icons/hryvnia?style=solid
        // Solid icon : Hryvnia
        val Hryvnia = Solid(0xf6f2)

        // https://fontawesome.com/icons/html5?style=brands
        // Brands icon : Html5
        val Html5 = Brand(0xf13b)

        // https://fontawesome.com/icons/hubspot?style=brands
        // Brands icon : Hubspot
        val Hubspot = Brand(0xf3b2)

        // https://fontawesome.com/icons/i-cursor?style=solid
        // Solid icon : ICursor
        val ICursor = Solid(0xf246)

        // https://fontawesome.com/icons/ice-cream?style=solid
        // Solid icon : IceCream
        val IceCream = Solid(0xf810)

        // https://fontawesome.com/icons/icicles?style=solid
        // Solid icon : Icicles
        val Icicles = Solid(0xf7ad)

        // https://fontawesome.com/icons/icons?style=solid
        // Solid icon : Icons
        val Icons = Solid(0xf86d)

        // https://fontawesome.com/icons/id-badge?style=solid
        // Solid icon : IdBadge
        val IdBadge = Solid(0xf2c1)

        // https://fontawesome.com/icons/id-badge?style=regular
        // Regular icon : IdBadge
        val IdBadgeRegular = Regular(0xf2c1)

        // https://fontawesome.com/icons/id-card?style=solid
        // Solid icon : IdCard
        val IdCard = Solid(0xf2c2)

        // https://fontawesome.com/icons/id-card?style=regular
        // Regular icon : IdCard
        val IdCardRegular = Regular(0xf2c2)

        // https://fontawesome.com/icons/id-card-alt?style=solid
        // Solid icon : IdCardAlt
        val IdCardAlt = Solid(0xf47f)

        // https://fontawesome.com/icons/ideal?style=brands
        // Brands icon : Ideal
        val Ideal = Brand(0xe013)

        // https://fontawesome.com/icons/igloo?style=solid
        // Solid icon : Igloo
        val Igloo = Solid(0xf7ae)

        // https://fontawesome.com/icons/image?style=solid
        // Solid icon : Image
        val Image = Solid(0xf03e)

        // https://fontawesome.com/icons/image?style=regular
        // Regular icon : Image
        val ImageRegular = Regular(0xf03e)

        // https://fontawesome.com/icons/images?style=solid
        // Solid icon : Images
        val Images = Solid(0xf302)

        // https://fontawesome.com/icons/images?style=regular
        // Regular icon : Images
        val ImagesRegular = Regular(0xf302)

        // https://fontawesome.com/icons/imdb?style=brands
        // Brands icon : Imdb
        val Imdb = Brand(0xf2d8)

        // https://fontawesome.com/icons/inbox?style=solid
        // Solid icon : Inbox
        val Inbox = Solid(0xf01c)

        // https://fontawesome.com/icons/indent?style=solid
        // Solid icon : Indent
        val Indent = Solid(0xf03c)

        // https://fontawesome.com/icons/industry?style=solid
        // Solid icon : Industry
        val Industry = Solid(0xf275)

        // https://fontawesome.com/icons/infinity?style=solid
        // Solid icon : Infinity
        val Infinity = Solid(0xf534)

        // https://fontawesome.com/icons/info?style=solid
        // Solid icon : Info
        val Info = Solid(0xf129)

        // https://fontawesome.com/icons/info-circle?style=solid
        // Solid icon : InfoCircle
        val InfoCircle = Solid(0xf05a)

        // https://fontawesome.com/icons/innosoft?style=brands
        // Brands icon : Innosoft
        val Innosoft = Brand(0xe080)

        // https://fontawesome.com/icons/instagram?style=brands
        // Brands icon : Instagram
        val Instagram = Brand(0xf16d)

        // https://fontawesome.com/icons/instagram-square?style=brands
        // Brands icon : InstagramSquare
        val InstagramSquare = Brand(0xe055)

        // https://fontawesome.com/icons/instalod?style=brands
        // Brands icon : Instalod
        val Instalod = Brand(0xe081)

        // https://fontawesome.com/icons/intercom?style=brands
        // Brands icon : Intercom
        val Intercom = Brand(0xf7af)

        // https://fontawesome.com/icons/internet-explorer?style=brands
        // Brands icon : InternetExplorer
        val InternetExplorer = Brand(0xf26b)

        // https://fontawesome.com/icons/invision?style=brands
        // Brands icon : Invision
        val Invision = Brand(0xf7b0)

        // https://fontawesome.com/icons/ioxhost?style=brands
        // Brands icon : Ioxhost
        val Ioxhost = Brand(0xf208)

        // https://fontawesome.com/icons/italic?style=solid
        // Solid icon : Italic
        val Italic = Solid(0xf033)

        // https://fontawesome.com/icons/itch-io?style=brands
        // Brands icon : ItchIo
        val ItchIo = Brand(0xf83a)

        // https://fontawesome.com/icons/itunes?style=brands
        // Brands icon : Itunes
        val Itunes = Brand(0xf3b4)

        // https://fontawesome.com/icons/itunes-note?style=brands
        // Brands icon : ItunesNote
        val ItunesNote = Brand(0xf3b5)

        // https://fontawesome.com/icons/java?style=brands
        // Brands icon : Java
        val Java = Brand(0xf4e4)

        // https://fontawesome.com/icons/jedi?style=solid
        // Solid icon : Jedi
        val Jedi = Solid(0xf669)

        // https://fontawesome.com/icons/jedi-order?style=brands
        // Brands icon : JediOrder
        val JediOrder = Brand(0xf50e)

        // https://fontawesome.com/icons/jenkins?style=brands
        // Brands icon : Jenkins
        val Jenkins = Brand(0xf3b6)

        // https://fontawesome.com/icons/jira?style=brands
        // Brands icon : Jira
        val Jira = Brand(0xf7b1)

        // https://fontawesome.com/icons/joget?style=brands
        // Brands icon : Joget
        val Joget = Brand(0xf3b7)

        // https://fontawesome.com/icons/joint?style=solid
        // Solid icon : Joint
        val Joint = Solid(0xf595)

        // https://fontawesome.com/icons/joomla?style=brands
        // Brands icon : Joomla
        val Joomla = Brand(0xf1aa)

        // https://fontawesome.com/icons/journal-whills?style=solid
        // Solid icon : JournalWhills
        val JournalWhills = Solid(0xf66a)

        // https://fontawesome.com/icons/js?style=brands
        // Brands icon : Js
        val Js = Brand(0xf3b8)

        // https://fontawesome.com/icons/js-square?style=brands
        // Brands icon : JsSquare
        val JsSquare = Brand(0xf3b9)

        // https://fontawesome.com/icons/jsfiddle?style=brands
        // Brands icon : Jsfiddle
        val Jsfiddle = Brand(0xf1cc)

        // https://fontawesome.com/icons/kaaba?style=solid
        // Solid icon : Kaaba
        val Kaaba = Solid(0xf66b)

        // https://fontawesome.com/icons/kaggle?style=brands
        // Brands icon : Kaggle
        val Kaggle = Brand(0xf5fa)

        // https://fontawesome.com/icons/key?style=solid
        // Solid icon : Key
        val Key = Solid(0xf084)

        // https://fontawesome.com/icons/keybase?style=brands
        // Brands icon : Keybase
        val Keybase = Brand(0xf4f5)

        // https://fontawesome.com/icons/keyboard?style=solid
        // Solid icon : Keyboard
        val Keyboard = Solid(0xf11c)

        // https://fontawesome.com/icons/keyboard?style=regular
        // Regular icon : Keyboard
        val KeyboardRegular = Regular(0xf11c)

        // https://fontawesome.com/icons/keycdn?style=brands
        // Brands icon : Keycdn
        val Keycdn = Brand(0xf3ba)

        // https://fontawesome.com/icons/khanda?style=solid
        // Solid icon : Khanda
        val Khanda = Solid(0xf66d)

        // https://fontawesome.com/icons/kickstarter?style=brands
        // Brands icon : Kickstarter
        val Kickstarter = Brand(0xf3bb)

        // https://fontawesome.com/icons/kickstarter-k?style=brands
        // Brands icon : KickstarterK
        val KickstarterK = Brand(0xf3bc)

        // https://fontawesome.com/icons/kiss?style=solid
        // Solid icon : Kiss
        val Kiss = Solid(0xf596)

        // https://fontawesome.com/icons/kiss?style=regular
        // Regular icon : Kiss
        val KissRegular = Regular(0xf596)

        // https://fontawesome.com/icons/kiss-beam?style=solid
        // Solid icon : KissBeam
        val KissBeam = Solid(0xf597)

        // https://fontawesome.com/icons/kiss-beam?style=regular
        // Regular icon : KissBeam
        val KissBeamRegular = Regular(0xf597)

        // https://fontawesome.com/icons/kiss-wink-heart?style=solid
        // Solid icon : KissWinkHeart
        val KissWinkHeart = Solid(0xf598)

        // https://fontawesome.com/icons/kiss-wink-heart?style=regular
        // Regular icon : KissWinkHeart
        val KissWinkHeartRegular = Regular(0xf598)

        // https://fontawesome.com/icons/kiwi-bird?style=solid
        // Solid icon : KiwiBird
        val KiwiBird = Solid(0xf535)

        // https://fontawesome.com/icons/korvue?style=brands
        // Brands icon : Korvue
        val Korvue = Brand(0xf42f)

        // https://fontawesome.com/icons/landmark?style=solid
        // Solid icon : Landmark
        val Landmark = Solid(0xf66f)

        // https://fontawesome.com/icons/language?style=solid
        // Solid icon : Language
        val Language = Solid(0xf1ab)

        // https://fontawesome.com/icons/laptop?style=solid
        // Solid icon : Laptop
        val Laptop = Solid(0xf109)

        // https://fontawesome.com/icons/laptop-code?style=solid
        // Solid icon : LaptopCode
        val LaptopCode = Solid(0xf5fc)

        // https://fontawesome.com/icons/laptop-house?style=solid
        // Solid icon : LaptopHouse
        val LaptopHouse = Solid(0xe066)

        // https://fontawesome.com/icons/laptop-medical?style=solid
        // Solid icon : LaptopMedical
        val LaptopMedical = Solid(0xf812)

        // https://fontawesome.com/icons/laravel?style=brands
        // Brands icon : Laravel
        val Laravel = Brand(0xf3bd)

        // https://fontawesome.com/icons/lastfm?style=brands
        // Brands icon : Lastfm
        val Lastfm = Brand(0xf202)

        // https://fontawesome.com/icons/lastfm-square?style=brands
        // Brands icon : LastfmSquare
        val LastfmSquare = Brand(0xf203)

        // https://fontawesome.com/icons/laugh?style=solid
        // Solid icon : Laugh
        val Laugh = Solid(0xf599)

        // https://fontawesome.com/icons/laugh?style=regular
        // Regular icon : Laugh
        val LaughRegular = Regular(0xf599)

        // https://fontawesome.com/icons/laugh-beam?style=solid
        // Solid icon : LaughBeam
        val LaughBeam = Solid(0xf59a)

        // https://fontawesome.com/icons/laugh-beam?style=regular
        // Regular icon : LaughBeam
        val LaughBeamRegular = Regular(0xf59a)

        // https://fontawesome.com/icons/laugh-squint?style=solid
        // Solid icon : LaughSquint
        val LaughSquint = Solid(0xf59b)

        // https://fontawesome.com/icons/laugh-squint?style=regular
        // Regular icon : LaughSquint
        val LaughSquintRegular = Regular(0xf59b)

        // https://fontawesome.com/icons/laugh-wink?style=solid
        // Solid icon : LaughWink
        val LaughWink = Solid(0xf59c)

        // https://fontawesome.com/icons/laugh-wink?style=regular
        // Regular icon : LaughWink
        val LaughWinkRegular = Regular(0xf59c)

        // https://fontawesome.com/icons/layer-group?style=solid
        // Solid icon : LayerGroup
        val LayerGroup = Solid(0xf5fd)

        // https://fontawesome.com/icons/leaf?style=solid
        // Solid icon : Leaf
        val Leaf = Solid(0xf06c)

        // https://fontawesome.com/icons/leanpub?style=brands
        // Brands icon : Leanpub
        val Leanpub = Brand(0xf212)

        // https://fontawesome.com/icons/lemon?style=solid
        // Solid icon : Lemon
        val Lemon = Solid(0xf094)

        // https://fontawesome.com/icons/lemon?style=regular
        // Regular icon : Lemon
        val LemonRegular = Regular(0xf094)

        // https://fontawesome.com/icons/less?style=brands
        // Brands icon : Less
        val Less = Brand(0xf41d)

        // https://fontawesome.com/icons/less-than?style=solid
        // Solid icon : LessThan
        val LessThan = Solid(0xf536)

        // https://fontawesome.com/icons/less-than-equal?style=solid
        // Solid icon : LessThanEqual
        val LessThanEqual = Solid(0xf537)

        // https://fontawesome.com/icons/level-down-alt?style=solid
        // Solid icon : LevelDownAlt
        val LevelDownAlt = Solid(0xf3be)

        // https://fontawesome.com/icons/level-up-alt?style=solid
        // Solid icon : LevelUpAlt
        val LevelUpAlt = Solid(0xf3bf)

        // https://fontawesome.com/icons/life-ring?style=solid
        // Solid icon : LifeRing
        val LifeRing = Solid(0xf1cd)

        // https://fontawesome.com/icons/life-ring?style=regular
        // Regular icon : LifeRing
        val LifeRingRegular = Regular(0xf1cd)

        // https://fontawesome.com/icons/lightbulb?style=solid
        // Solid icon : Lightbulb
        val Lightbulb = Solid(0xf0eb)

        // https://fontawesome.com/icons/lightbulb?style=regular
        // Regular icon : Lightbulb
        val LightbulbRegular = Regular(0xf0eb)

        // https://fontawesome.com/icons/line?style=brands
        // Brands icon : Line
        val Line = Brand(0xf3c0)

        // https://fontawesome.com/icons/link?style=solid
        // Solid icon : Link
        val Link = Solid(0xf0c1)

        // https://fontawesome.com/icons/linkedin?style=brands
        // Brands icon : Linkedin
        val Linkedin = Brand(0xf08c)

        // https://fontawesome.com/icons/linkedin-in?style=brands
        // Brands icon : LinkedinIn
        val LinkedinIn = Brand(0xf0e1)

        // https://fontawesome.com/icons/linode?style=brands
        // Brands icon : Linode
        val Linode = Brand(0xf2b8)

        // https://fontawesome.com/icons/linux?style=brands
        // Brands icon : Linux
        val Linux = Brand(0xf17c)

        // https://fontawesome.com/icons/lira-sign?style=solid
        // Solid icon : LiraSign
        val LiraSign = Solid(0xf195)

        // https://fontawesome.com/icons/list?style=solid
        // Solid icon : List
        val List = Solid(0xf03a)

        // https://fontawesome.com/icons/list-alt?style=solid
        // Solid icon : ListAlt
        val ListAlt = Solid(0xf022)

        // https://fontawesome.com/icons/list-alt?style=regular
        // Regular icon : ListAlt
        val ListAltRegular = Regular(0xf022)

        // https://fontawesome.com/icons/list-ol?style=solid
        // Solid icon : ListOl
        val ListOl = Solid(0xf0cb)

        // https://fontawesome.com/icons/list-ul?style=solid
        // Solid icon : ListUl
        val ListUl = Solid(0xf0ca)

        // https://fontawesome.com/icons/location-arrow?style=solid
        // Solid icon : LocationArrow
        val LocationArrow = Solid(0xf124)

        // https://fontawesome.com/icons/lock?style=solid
        // Solid icon : Lock
        val Lock = Solid(0xf023)

        // https://fontawesome.com/icons/lock-open?style=solid
        // Solid icon : LockOpen
        val LockOpen = Solid(0xf3c1)

        // https://fontawesome.com/icons/long-arrow-alt-down?style=solid
        // Solid icon : LongArrowAltDown
        val LongArrowAltDown = Solid(0xf309)

        // https://fontawesome.com/icons/long-arrow-alt-left?style=solid
        // Solid icon : LongArrowAltLeft
        val LongArrowAltLeft = Solid(0xf30a)

        // https://fontawesome.com/icons/long-arrow-alt-right?style=solid
        // Solid icon : LongArrowAltRight
        val LongArrowAltRight = Solid(0xf30b)

        // https://fontawesome.com/icons/long-arrow-alt-up?style=solid
        // Solid icon : LongArrowAltUp
        val LongArrowAltUp = Solid(0xf30c)

        // https://fontawesome.com/icons/low-vision?style=solid
        // Solid icon : LowVision
        val LowVision = Solid(0xf2a8)

        // https://fontawesome.com/icons/luggage-cart?style=solid
        // Solid icon : LuggageCart
        val LuggageCart = Solid(0xf59d)

        // https://fontawesome.com/icons/lungs?style=solid
        // Solid icon : Lungs
        val Lungs = Solid(0xf604)

        // https://fontawesome.com/icons/lungs-virus?style=solid
        // Solid icon : LungsVirus
        val LungsVirus = Solid(0xe067)

        // https://fontawesome.com/icons/lyft?style=brands
        // Brands icon : Lyft
        val Lyft = Brand(0xf3c3)

        // https://fontawesome.com/icons/magento?style=brands
        // Brands icon : Magento
        val Magento = Brand(0xf3c4)

        // https://fontawesome.com/icons/magic?style=solid
        // Solid icon : Magic
        val Magic = Solid(0xf0d0)

        // https://fontawesome.com/icons/magnet?style=solid
        // Solid icon : Magnet
        val Magnet = Solid(0xf076)

        // https://fontawesome.com/icons/mail-bulk?style=solid
        // Solid icon : MailBulk
        val MailBulk = Solid(0xf674)

        // https://fontawesome.com/icons/mailchimp?style=brands
        // Brands icon : Mailchimp
        val Mailchimp = Brand(0xf59e)

        // https://fontawesome.com/icons/male?style=solid
        // Solid icon : Male
        val Male = Solid(0xf183)

        // https://fontawesome.com/icons/mandalorian?style=brands
        // Brands icon : Mandalorian
        val Mandalorian = Brand(0xf50f)

        // https://fontawesome.com/icons/map?style=solid
        // Solid icon : Map
        val Map = Solid(0xf279)

        // https://fontawesome.com/icons/map?style=regular
        // Regular icon : Map
        val MapRegular = Regular(0xf279)

        // https://fontawesome.com/icons/map-marked?style=solid
        // Solid icon : MapMarked
        val MapMarked = Solid(0xf59f)

        // https://fontawesome.com/icons/map-marked-alt?style=solid
        // Solid icon : MapMarkedAlt
        val MapMarkedAlt = Solid(0xf5a0)

        // https://fontawesome.com/icons/map-marker?style=solid
        // Solid icon : MapMarker
        val MapMarker = Solid(0xf041)

        // https://fontawesome.com/icons/map-marker-alt?style=solid
        // Solid icon : MapMarkerAlt
        val MapMarkerAlt = Solid(0xf3c5)

        // https://fontawesome.com/icons/map-pin?style=solid
        // Solid icon : MapPin
        val MapPin = Solid(0xf276)

        // https://fontawesome.com/icons/map-signs?style=solid
        // Solid icon : MapSigns
        val MapSigns = Solid(0xf277)

        // https://fontawesome.com/icons/markdown?style=brands
        // Brands icon : Markdown
        val Markdown = Brand(0xf60f)

        // https://fontawesome.com/icons/marker?style=solid
        // Solid icon : Marker
        val Marker = Solid(0xf5a1)

        // https://fontawesome.com/icons/mars?style=solid
        // Solid icon : Mars
        val Mars = Solid(0xf222)

        // https://fontawesome.com/icons/mars-double?style=solid
        // Solid icon : MarsDouble
        val MarsDouble = Solid(0xf227)

        // https://fontawesome.com/icons/mars-stroke?style=solid
        // Solid icon : MarsStroke
        val MarsStroke = Solid(0xf229)

        // https://fontawesome.com/icons/mars-stroke-h?style=solid
        // Solid icon : MarsStrokeH
        val MarsStrokeH = Solid(0xf22b)

        // https://fontawesome.com/icons/mars-stroke-v?style=solid
        // Solid icon : MarsStrokeV
        val MarsStrokeV = Solid(0xf22a)

        // https://fontawesome.com/icons/mask?style=solid
        // Solid icon : Mask
        val Mask = Solid(0xf6fa)

        // https://fontawesome.com/icons/mastodon?style=brands
        // Brands icon : Mastodon
        val Mastodon = Brand(0xf4f6)

        // https://fontawesome.com/icons/maxcdn?style=brands
        // Brands icon : Maxcdn
        val Maxcdn = Brand(0xf136)

        // https://fontawesome.com/icons/mdb?style=brands
        // Brands icon : Mdb
        val Mdb = Brand(0xf8ca)

        // https://fontawesome.com/icons/medal?style=solid
        // Solid icon : Medal
        val Medal = Solid(0xf5a2)

        // https://fontawesome.com/icons/medapps?style=brands
        // Brands icon : Medapps
        val Medapps = Brand(0xf3c6)

        // https://fontawesome.com/icons/medium?style=brands
        // Brands icon : Medium
        val Medium = Brand(0xf23a)

        // https://fontawesome.com/icons/medium-m?style=brands
        // Brands icon : MediumM
        val MediumM = Brand(0xf3c7)

        // https://fontawesome.com/icons/medkit?style=solid
        // Solid icon : Medkit
        val Medkit = Solid(0xf0fa)

        // https://fontawesome.com/icons/medrt?style=brands
        // Brands icon : Medrt
        val Medrt = Brand(0xf3c8)

        // https://fontawesome.com/icons/meetup?style=brands
        // Brands icon : Meetup
        val Meetup = Brand(0xf2e0)

        // https://fontawesome.com/icons/megaport?style=brands
        // Brands icon : Megaport
        val Megaport = Brand(0xf5a3)

        // https://fontawesome.com/icons/meh?style=solid
        // Solid icon : Meh
        val Meh = Solid(0xf11a)

        // https://fontawesome.com/icons/meh?style=regular
        // Regular icon : Meh
        val MehRegular = Regular(0xf11a)

        // https://fontawesome.com/icons/meh-blank?style=solid
        // Solid icon : MehBlank
        val MehBlank = Solid(0xf5a4)

        // https://fontawesome.com/icons/meh-blank?style=regular
        // Regular icon : MehBlank
        val MehBlankRegular = Regular(0xf5a4)

        // https://fontawesome.com/icons/meh-rolling-eyes?style=solid
        // Solid icon : MehRollingEyes
        val MehRollingEyes = Solid(0xf5a5)

        // https://fontawesome.com/icons/meh-rolling-eyes?style=regular
        // Regular icon : MehRollingEyes
        val MehRollingEyesRegular = Regular(0xf5a5)

        // https://fontawesome.com/icons/memory?style=solid
        // Solid icon : Memory
        val Memory = Solid(0xf538)

        // https://fontawesome.com/icons/mendeley?style=brands
        // Brands icon : Mendeley
        val Mendeley = Brand(0xf7b3)

        // https://fontawesome.com/icons/menorah?style=solid
        // Solid icon : Menorah
        val Menorah = Solid(0xf676)

        // https://fontawesome.com/icons/mercury?style=solid
        // Solid icon : Mercury
        val Mercury = Solid(0xf223)

        // https://fontawesome.com/icons/meteor?style=solid
        // Solid icon : Meteor
        val Meteor = Solid(0xf753)

        // https://fontawesome.com/icons/microblog?style=brands
        // Brands icon : Microblog
        val Microblog = Brand(0xe01a)

        // https://fontawesome.com/icons/microchip?style=solid
        // Solid icon : Microchip
        val Microchip = Solid(0xf2db)

        // https://fontawesome.com/icons/microphone?style=solid
        // Solid icon : Microphone
        val Microphone = Solid(0xf130)

        // https://fontawesome.com/icons/microphone-alt?style=solid
        // Solid icon : MicrophoneAlt
        val MicrophoneAlt = Solid(0xf3c9)

        // https://fontawesome.com/icons/microphone-alt-slash?style=solid
        // Solid icon : MicrophoneAltSlash
        val MicrophoneAltSlash = Solid(0xf539)

        // https://fontawesome.com/icons/microphone-slash?style=solid
        // Solid icon : MicrophoneSlash
        val MicrophoneSlash = Solid(0xf131)

        // https://fontawesome.com/icons/microscope?style=solid
        // Solid icon : Microscope
        val Microscope = Solid(0xf610)

        // https://fontawesome.com/icons/microsoft?style=brands
        // Brands icon : Microsoft
        val Microsoft = Brand(0xf3ca)

        // https://fontawesome.com/icons/minus?style=solid
        // Solid icon : Minus
        val Minus = Solid(0xf068)

        // https://fontawesome.com/icons/minus-circle?style=solid
        // Solid icon : MinusCircle
        val MinusCircle = Solid(0xf056)

        // https://fontawesome.com/icons/minus-square?style=solid
        // Solid icon : MinusSquare
        val MinusSquare = Solid(0xf146)

        // https://fontawesome.com/icons/minus-square?style=regular
        // Regular icon : MinusSquare
        val MinusSquareRegular = Regular(0xf146)

        // https://fontawesome.com/icons/mitten?style=solid
        // Solid icon : Mitten
        val Mitten = Solid(0xf7b5)

        // https://fontawesome.com/icons/mix?style=brands
        // Brands icon : Mix
        val Mix = Brand(0xf3cb)

        // https://fontawesome.com/icons/mixcloud?style=brands
        // Brands icon : Mixcloud
        val Mixcloud = Brand(0xf289)

        // https://fontawesome.com/icons/mixer?style=brands
        // Brands icon : Mixer
        val Mixer = Brand(0xe056)

        // https://fontawesome.com/icons/mizuni?style=brands
        // Brands icon : Mizuni
        val Mizuni = Brand(0xf3cc)

        // https://fontawesome.com/icons/mobile?style=solid
        // Solid icon : Mobile
        val Mobile = Solid(0xf10b)

        // https://fontawesome.com/icons/mobile-alt?style=solid
        // Solid icon : MobileAlt
        val MobileAlt = Solid(0xf3cd)

        // https://fontawesome.com/icons/modx?style=brands
        // Brands icon : Modx
        val Modx = Brand(0xf285)

        // https://fontawesome.com/icons/monero?style=brands
        // Brands icon : Monero
        val Monero = Brand(0xf3d0)

        // https://fontawesome.com/icons/money-bill?style=solid
        // Solid icon : MoneyBill
        val MoneyBill = Solid(0xf0d6)

        // https://fontawesome.com/icons/money-bill-alt?style=solid
        // Solid icon : MoneyBillAlt
        val MoneyBillAlt = Solid(0xf3d1)

        // https://fontawesome.com/icons/money-bill-alt?style=regular
        // Regular icon : MoneyBillAlt
        val MoneyBillAltRegular = Regular(0xf3d1)

        // https://fontawesome.com/icons/money-bill-wave?style=solid
        // Solid icon : MoneyBillWave
        val MoneyBillWave = Solid(0xf53a)

        // https://fontawesome.com/icons/money-bill-wave-alt?style=solid
        // Solid icon : MoneyBillWaveAlt
        val MoneyBillWaveAlt = Solid(0xf53b)

        // https://fontawesome.com/icons/money-check?style=solid
        // Solid icon : MoneyCheck
        val MoneyCheck = Solid(0xf53c)

        // https://fontawesome.com/icons/money-check-alt?style=solid
        // Solid icon : MoneyCheckAlt
        val MoneyCheckAlt = Solid(0xf53d)

        // https://fontawesome.com/icons/monument?style=solid
        // Solid icon : Monument
        val Monument = Solid(0xf5a6)

        // https://fontawesome.com/icons/moon?style=solid
        // Solid icon : Moon
        val Moon = Solid(0xf186)

        // https://fontawesome.com/icons/moon?style=regular
        // Regular icon : Moon
        val MoonRegular = Regular(0xf186)

        // https://fontawesome.com/icons/mortar-pestle?style=solid
        // Solid icon : MortarPestle
        val MortarPestle = Solid(0xf5a7)

        // https://fontawesome.com/icons/mosque?style=solid
        // Solid icon : Mosque
        val Mosque = Solid(0xf678)

        // https://fontawesome.com/icons/motorcycle?style=solid
        // Solid icon : Motorcycle
        val Motorcycle = Solid(0xf21c)

        // https://fontawesome.com/icons/mountain?style=solid
        // Solid icon : Mountain
        val Mountain = Solid(0xf6fc)

        // https://fontawesome.com/icons/mouse?style=solid
        // Solid icon : Mouse
        val Mouse = Solid(0xf8cc)

        // https://fontawesome.com/icons/mouse-pointer?style=solid
        // Solid icon : MousePointer
        val MousePointer = Solid(0xf245)

        // https://fontawesome.com/icons/mug-hot?style=solid
        // Solid icon : MugHot
        val MugHot = Solid(0xf7b6)

        // https://fontawesome.com/icons/music?style=solid
        // Solid icon : Music
        val Music = Solid(0xf001)

        // https://fontawesome.com/icons/napster?style=brands
        // Brands icon : Napster
        val Napster = Brand(0xf3d2)

        // https://fontawesome.com/icons/neos?style=brands
        // Brands icon : Neos
        val Neos = Brand(0xf612)

        // https://fontawesome.com/icons/network-wired?style=solid
        // Solid icon : NetworkWired
        val NetworkWired = Solid(0xf6ff)

        // https://fontawesome.com/icons/neuter?style=solid
        // Solid icon : Neuter
        val Neuter = Solid(0xf22c)

        // https://fontawesome.com/icons/newspaper?style=solid
        // Solid icon : Newspaper
        val Newspaper = Solid(0xf1ea)

        // https://fontawesome.com/icons/newspaper?style=regular
        // Regular icon : Newspaper
        val NewspaperRegular = Regular(0xf1ea)

        // https://fontawesome.com/icons/nimblr?style=brands
        // Brands icon : Nimblr
        val Nimblr = Brand(0xf5a8)

        // https://fontawesome.com/icons/node?style=brands
        // Brands icon : Node
        val Node = Brand(0xf419)

        // https://fontawesome.com/icons/node-js?style=brands
        // Brands icon : NodeJs
        val NodeJs = Brand(0xf3d3)

        // https://fontawesome.com/icons/not-equal?style=solid
        // Solid icon : NotEqual
        val NotEqual = Solid(0xf53e)

        // https://fontawesome.com/icons/notes-medical?style=solid
        // Solid icon : NotesMedical
        val NotesMedical = Solid(0xf481)

        // https://fontawesome.com/icons/npm?style=brands
        // Brands icon : Npm
        val Npm = Brand(0xf3d4)

        // https://fontawesome.com/icons/ns8?style=brands
        // Brands icon : Ns8
        val Ns8 = Brand(0xf3d5)

        // https://fontawesome.com/icons/nutritionix?style=brands
        // Brands icon : Nutritionix
        val Nutritionix = Brand(0xf3d6)

        // https://fontawesome.com/icons/object-group?style=solid
        // Solid icon : ObjectGroup
        val ObjectGroup = Solid(0xf247)

        // https://fontawesome.com/icons/object-group?style=regular
        // Regular icon : ObjectGroup
        val ObjectGroupRegular = Regular(0xf247)

        // https://fontawesome.com/icons/object-ungroup?style=solid
        // Solid icon : ObjectUngroup
        val ObjectUngroup = Solid(0xf248)

        // https://fontawesome.com/icons/object-ungroup?style=regular
        // Regular icon : ObjectUngroup
        val ObjectUngroupRegular = Regular(0xf248)

        // https://fontawesome.com/icons/octopus-deploy?style=brands
        // Brands icon : OctopusDeploy
        val OctopusDeploy = Brand(0xe082)

        // https://fontawesome.com/icons/odnoklassniki?style=brands
        // Brands icon : Odnoklassniki
        val Odnoklassniki = Brand(0xf263)

        // https://fontawesome.com/icons/odnoklassniki-square?style=brands
        // Brands icon : OdnoklassnikiSquare
        val OdnoklassnikiSquare = Brand(0xf264)

        // https://fontawesome.com/icons/oil-can?style=solid
        // Solid icon : OilCan
        val OilCan = Solid(0xf613)

        // https://fontawesome.com/icons/old-republic?style=brands
        // Brands icon : OldRepublic
        val OldRepublic = Brand(0xf510)

        // https://fontawesome.com/icons/om?style=solid
        // Solid icon : Om
        val Om = Solid(0xf679)

        // https://fontawesome.com/icons/opencart?style=brands
        // Brands icon : Opencart
        val Opencart = Brand(0xf23d)

        // https://fontawesome.com/icons/openid?style=brands
        // Brands icon : Openid
        val Openid = Brand(0xf19b)

        // https://fontawesome.com/icons/opera?style=brands
        // Brands icon : Opera
        val Opera = Brand(0xf26a)

        // https://fontawesome.com/icons/optin-monster?style=brands
        // Brands icon : OptinMonster
        val OptinMonster = Brand(0xf23c)

        // https://fontawesome.com/icons/orcid?style=brands
        // Brands icon : Orcid
        val Orcid = Brand(0xf8d2)

        // https://fontawesome.com/icons/osi?style=brands
        // Brands icon : Osi
        val Osi = Brand(0xf41a)

        // https://fontawesome.com/icons/otter?style=solid
        // Solid icon : Otter
        val Otter = Solid(0xf700)

        // https://fontawesome.com/icons/outdent?style=solid
        // Solid icon : Outdent
        val Outdent = Solid(0xf03b)

        // https://fontawesome.com/icons/page4?style=brands
        // Brands icon : Page4
        val Page4 = Brand(0xf3d7)

        // https://fontawesome.com/icons/pagelines?style=brands
        // Brands icon : Pagelines
        val Pagelines = Brand(0xf18c)

        // https://fontawesome.com/icons/pager?style=solid
        // Solid icon : Pager
        val Pager = Solid(0xf815)

        // https://fontawesome.com/icons/paint-brush?style=solid
        // Solid icon : PaintBrush
        val PaintBrush = Solid(0xf1fc)

        // https://fontawesome.com/icons/paint-roller?style=solid
        // Solid icon : PaintRoller
        val PaintRoller = Solid(0xf5aa)

        // https://fontawesome.com/icons/palette?style=solid
        // Solid icon : Palette
        val Palette = Solid(0xf53f)

        // https://fontawesome.com/icons/palfed?style=brands
        // Brands icon : Palfed
        val Palfed = Brand(0xf3d8)

        // https://fontawesome.com/icons/pallet?style=solid
        // Solid icon : Pallet
        val Pallet = Solid(0xf482)

        // https://fontawesome.com/icons/paper-plane?style=solid
        // Solid icon : PaperPlane
        val PaperPlane = Solid(0xf1d8)

        // https://fontawesome.com/icons/paper-plane?style=regular
        // Regular icon : PaperPlane
        val PaperPlaneRegular = Regular(0xf1d8)

        // https://fontawesome.com/icons/paperclip?style=solid
        // Solid icon : Paperclip
        val Paperclip = Solid(0xf0c6)

        // https://fontawesome.com/icons/parachute-box?style=solid
        // Solid icon : ParachuteBox
        val ParachuteBox = Solid(0xf4cd)

        // https://fontawesome.com/icons/paragraph?style=solid
        // Solid icon : Paragraph
        val Paragraph = Solid(0xf1dd)

        // https://fontawesome.com/icons/parking?style=solid
        // Solid icon : Parking
        val Parking = Solid(0xf540)

        // https://fontawesome.com/icons/passport?style=solid
        // Solid icon : Passport
        val Passport = Solid(0xf5ab)

        // https://fontawesome.com/icons/pastafarianism?style=solid
        // Solid icon : Pastafarianism
        val Pastafarianism = Solid(0xf67b)

        // https://fontawesome.com/icons/paste?style=solid
        // Solid icon : Paste
        val Paste = Solid(0xf0ea)

        // https://fontawesome.com/icons/patreon?style=brands
        // Brands icon : Patreon
        val Patreon = Brand(0xf3d9)

        // https://fontawesome.com/icons/pause?style=solid
        // Solid icon : Pause
        val Pause = Solid(0xf04c)

        // https://fontawesome.com/icons/pause-circle?style=solid
        // Solid icon : PauseCircle
        val PauseCircle = Solid(0xf28b)

        // https://fontawesome.com/icons/pause-circle?style=regular
        // Regular icon : PauseCircle
        val PauseCircleRegular = Regular(0xf28b)

        // https://fontawesome.com/icons/paw?style=solid
        // Solid icon : Paw
        val Paw = Solid(0xf1b0)

        // https://fontawesome.com/icons/paypal?style=brands
        // Brands icon : Paypal
        val Paypal = Brand(0xf1ed)

        // https://fontawesome.com/icons/peace?style=solid
        // Solid icon : Peace
        val Peace = Solid(0xf67c)

        // https://fontawesome.com/icons/pen?style=solid
        // Solid icon : Pen
        val Pen = Solid(0xf304)

        // https://fontawesome.com/icons/pen-alt?style=solid
        // Solid icon : PenAlt
        val PenAlt = Solid(0xf305)

        // https://fontawesome.com/icons/pen-fancy?style=solid
        // Solid icon : PenFancy
        val PenFancy = Solid(0xf5ac)

        // https://fontawesome.com/icons/pen-nib?style=solid
        // Solid icon : PenNib
        val PenNib = Solid(0xf5ad)

        // https://fontawesome.com/icons/pen-square?style=solid
        // Solid icon : PenSquare
        val PenSquare = Solid(0xf14b)

        // https://fontawesome.com/icons/pencil-alt?style=solid
        // Solid icon : PencilAlt
        val PencilAlt = Solid(0xf303)

        // https://fontawesome.com/icons/pencil-ruler?style=solid
        // Solid icon : PencilRuler
        val PencilRuler = Solid(0xf5ae)

        // https://fontawesome.com/icons/penny-arcade?style=brands
        // Brands icon : PennyArcade
        val PennyArcade = Brand(0xf704)

        // https://fontawesome.com/icons/people-arrows?style=solid
        // Solid icon : PeopleArrows
        val PeopleArrows = Solid(0xe068)

        // https://fontawesome.com/icons/people-carry?style=solid
        // Solid icon : PeopleCarry
        val PeopleCarry = Solid(0xf4ce)

        // https://fontawesome.com/icons/pepper-hot?style=solid
        // Solid icon : PepperHot
        val PepperHot = Solid(0xf816)

        // https://fontawesome.com/icons/perbyte?style=brands
        // Brands icon : Perbyte
        val Perbyte = Brand(0xe083)

        // https://fontawesome.com/icons/percent?style=solid
        // Solid icon : Percent
        val Percent = Solid(0xf295)

        // https://fontawesome.com/icons/percentage?style=solid
        // Solid icon : Percentage
        val Percentage = Solid(0xf541)

        // https://fontawesome.com/icons/periscope?style=brands
        // Brands icon : Periscope
        val Periscope = Brand(0xf3da)

        // https://fontawesome.com/icons/person-booth?style=solid
        // Solid icon : PersonBooth
        val PersonBooth = Solid(0xf756)

        // https://fontawesome.com/icons/phabricator?style=brands
        // Brands icon : Phabricator
        val Phabricator = Brand(0xf3db)

        // https://fontawesome.com/icons/phoenix-framework?style=brands
        // Brands icon : PhoenixFramework
        val PhoenixFramework = Brand(0xf3dc)

        // https://fontawesome.com/icons/phoenix-squadron?style=brands
        // Brands icon : PhoenixSquadron
        val PhoenixSquadron = Brand(0xf511)

        // https://fontawesome.com/icons/phone?style=solid
        // Solid icon : Phone
        val Phone = Solid(0xf095)

        // https://fontawesome.com/icons/phone-alt?style=solid
        // Solid icon : PhoneAlt
        val PhoneAlt = Solid(0xf879)

        // https://fontawesome.com/icons/phone-slash?style=solid
        // Solid icon : PhoneSlash
        val PhoneSlash = Solid(0xf3dd)

        // https://fontawesome.com/icons/phone-square?style=solid
        // Solid icon : PhoneSquare
        val PhoneSquare = Solid(0xf098)

        // https://fontawesome.com/icons/phone-square-alt?style=solid
        // Solid icon : PhoneSquareAlt
        val PhoneSquareAlt = Solid(0xf87b)

        // https://fontawesome.com/icons/phone-volume?style=solid
        // Solid icon : PhoneVolume
        val PhoneVolume = Solid(0xf2a0)

        // https://fontawesome.com/icons/photo-video?style=solid
        // Solid icon : PhotoVideo
        val PhotoVideo = Solid(0xf87c)

        // https://fontawesome.com/icons/php?style=brands
        // Brands icon : Php
        val Php = Brand(0xf457)

        // https://fontawesome.com/icons/pied-piper?style=brands
        // Brands icon : PiedPiper
        val PiedPiper = Brand(0xf2ae)

        // https://fontawesome.com/icons/pied-piper-alt?style=brands
        // Brands icon : PiedPiperAlt
        val PiedPiperAlt = Brand(0xf1a8)

        // https://fontawesome.com/icons/pied-piper-hat?style=brands
        // Brands icon : PiedPiperHat
        val PiedPiperHat = Brand(0xf4e5)

        // https://fontawesome.com/icons/pied-piper-pp?style=brands
        // Brands icon : PiedPiperPp
        val PiedPiperPp = Brand(0xf1a7)

        // https://fontawesome.com/icons/pied-piper-square?style=brands
        // Brands icon : PiedPiperSquare
        val PiedPiperSquare = Brand(0xe01e)

        // https://fontawesome.com/icons/piggy-bank?style=solid
        // Solid icon : PiggyBank
        val PiggyBank = Solid(0xf4d3)

        // https://fontawesome.com/icons/pills?style=solid
        // Solid icon : Pills
        val Pills = Solid(0xf484)

        // https://fontawesome.com/icons/pinterest?style=brands
        // Brands icon : Pinterest
        val Pinterest = Brand(0xf0d2)

        // https://fontawesome.com/icons/pinterest-p?style=brands
        // Brands icon : PinterestP
        val PinterestP = Brand(0xf231)

        // https://fontawesome.com/icons/pinterest-square?style=brands
        // Brands icon : PinterestSquare
        val PinterestSquare = Brand(0xf0d3)

        // https://fontawesome.com/icons/pizza-slice?style=solid
        // Solid icon : PizzaSlice
        val PizzaSlice = Solid(0xf818)

        // https://fontawesome.com/icons/place-of-worship?style=solid
        // Solid icon : PlaceOfWorship
        val PlaceOfWorship = Solid(0xf67f)

        // https://fontawesome.com/icons/plane?style=solid
        // Solid icon : Plane
        val Plane = Solid(0xf072)

        // https://fontawesome.com/icons/plane-arrival?style=solid
        // Solid icon : PlaneArrival
        val PlaneArrival = Solid(0xf5af)

        // https://fontawesome.com/icons/plane-departure?style=solid
        // Solid icon : PlaneDeparture
        val PlaneDeparture = Solid(0xf5b0)

        // https://fontawesome.com/icons/plane-slash?style=solid
        // Solid icon : PlaneSlash
        val PlaneSlash = Solid(0xe069)

        // https://fontawesome.com/icons/play?style=solid
        // Solid icon : Play
        val Play = Solid(0xf04b)

        // https://fontawesome.com/icons/play-circle?style=solid
        // Solid icon : PlayCircle
        val PlayCircle = Solid(0xf144)

        // https://fontawesome.com/icons/play-circle?style=regular
        // Regular icon : PlayCircle
        val PlayCircleRegular = Regular(0xf144)

        // https://fontawesome.com/icons/playstation?style=brands
        // Brands icon : Playstation
        val Playstation = Brand(0xf3df)

        // https://fontawesome.com/icons/plug?style=solid
        // Solid icon : Plug
        val Plug = Solid(0xf1e6)

        // https://fontawesome.com/icons/plus?style=solid
        // Solid icon : Plus
        val Plus = Solid(0xf067)

        // https://fontawesome.com/icons/plus-circle?style=solid
        // Solid icon : PlusCircle
        val PlusCircle = Solid(0xf055)

        // https://fontawesome.com/icons/plus-square?style=solid
        // Solid icon : PlusSquare
        val PlusSquare = Solid(0xf0fe)

        // https://fontawesome.com/icons/plus-square?style=regular
        // Regular icon : PlusSquare
        val PlusSquareRegular = Regular(0xf0fe)

        // https://fontawesome.com/icons/podcast?style=solid
        // Solid icon : Podcast
        val Podcast = Solid(0xf2ce)

        // https://fontawesome.com/icons/poll?style=solid
        // Solid icon : Poll
        val Poll = Solid(0xf681)

        // https://fontawesome.com/icons/poll-h?style=solid
        // Solid icon : PollH
        val PollH = Solid(0xf682)

        // https://fontawesome.com/icons/poo?style=solid
        // Solid icon : Poo
        val Poo = Solid(0xf2fe)

        // https://fontawesome.com/icons/poo-storm?style=solid
        // Solid icon : PooStorm
        val PooStorm = Solid(0xf75a)

        // https://fontawesome.com/icons/poop?style=solid
        // Solid icon : Poop
        val Poop = Solid(0xf619)

        // https://fontawesome.com/icons/portrait?style=solid
        // Solid icon : Portrait
        val Portrait = Solid(0xf3e0)

        // https://fontawesome.com/icons/pound-sign?style=solid
        // Solid icon : PoundSign
        val PoundSign = Solid(0xf154)

        // https://fontawesome.com/icons/power-off?style=solid
        // Solid icon : PowerOff
        val PowerOff = Solid(0xf011)

        // https://fontawesome.com/icons/pray?style=solid
        // Solid icon : Pray
        val Pray = Solid(0xf683)

        // https://fontawesome.com/icons/praying-hands?style=solid
        // Solid icon : PrayingHands
        val PrayingHands = Solid(0xf684)

        // https://fontawesome.com/icons/prescription?style=solid
        // Solid icon : Prescription
        val Prescription = Solid(0xf5b1)

        // https://fontawesome.com/icons/prescription-bottle?style=solid
        // Solid icon : PrescriptionBottle
        val PrescriptionBottle = Solid(0xf485)

        // https://fontawesome.com/icons/prescription-bottle-alt?style=solid
        // Solid icon : PrescriptionBottleAlt
        val PrescriptionBottleAlt = Solid(0xf486)

        // https://fontawesome.com/icons/print?style=solid
        // Solid icon : Print
        val Print = Solid(0xf02f)

        // https://fontawesome.com/icons/procedures?style=solid
        // Solid icon : Procedures
        val Procedures = Solid(0xf487)

        // https://fontawesome.com/icons/product-hunt?style=brands
        // Brands icon : ProductHunt
        val ProductHunt = Brand(0xf288)

        // https://fontawesome.com/icons/project-diagram?style=solid
        // Solid icon : ProjectDiagram
        val ProjectDiagram = Solid(0xf542)

        // https://fontawesome.com/icons/pump-medical?style=solid
        // Solid icon : PumpMedical
        val PumpMedical = Solid(0xe06a)

        // https://fontawesome.com/icons/pump-soap?style=solid
        // Solid icon : PumpSoap
        val PumpSoap = Solid(0xe06b)

        // https://fontawesome.com/icons/pushed?style=brands
        // Brands icon : Pushed
        val Pushed = Brand(0xf3e1)

        // https://fontawesome.com/icons/puzzle-piece?style=solid
        // Solid icon : PuzzlePiece
        val PuzzlePiece = Solid(0xf12e)

        // https://fontawesome.com/icons/python?style=brands
        // Brands icon : Python
        val Python = Brand(0xf3e2)

        // https://fontawesome.com/icons/qq?style=brands
        // Brands icon : Qq
        val Qq = Brand(0xf1d6)

        // https://fontawesome.com/icons/qrcode?style=solid
        // Solid icon : Qrcode
        val Qrcode = Solid(0xf029)

        // https://fontawesome.com/icons/question?style=solid
        // Solid icon : Question
        val Question = Solid(0xf128)

        // https://fontawesome.com/icons/question-circle?style=solid
        // Solid icon : QuestionCircle
        val QuestionCircle = Solid(0xf059)

        // https://fontawesome.com/icons/question-circle?style=regular
        // Regular icon : QuestionCircle
        val QuestionCircleRegular = Regular(0xf059)

        // https://fontawesome.com/icons/quidditch?style=solid
        // Solid icon : Quidditch
        val Quidditch = Solid(0xf458)

        // https://fontawesome.com/icons/quinscape?style=brands
        // Brands icon : Quinscape
        val Quinscape = Brand(0xf459)

        // https://fontawesome.com/icons/quora?style=brands
        // Brands icon : Quora
        val Quora = Brand(0xf2c4)

        // https://fontawesome.com/icons/quote-left?style=solid
        // Solid icon : QuoteLeft
        val QuoteLeft = Solid(0xf10d)

        // https://fontawesome.com/icons/quote-right?style=solid
        // Solid icon : QuoteRight
        val QuoteRight = Solid(0xf10e)

        // https://fontawesome.com/icons/quran?style=solid
        // Solid icon : Quran
        val Quran = Solid(0xf687)

        // https://fontawesome.com/icons/r-project?style=brands
        // Brands icon : RProject
        val RProject = Brand(0xf4f7)

        // https://fontawesome.com/icons/radiation?style=solid
        // Solid icon : Radiation
        val Radiation = Solid(0xf7b9)

        // https://fontawesome.com/icons/radiation-alt?style=solid
        // Solid icon : RadiationAlt
        val RadiationAlt = Solid(0xf7ba)

        // https://fontawesome.com/icons/rainbow?style=solid
        // Solid icon : Rainbow
        val Rainbow = Solid(0xf75b)

        // https://fontawesome.com/icons/random?style=solid
        // Solid icon : Random
        val Random = Solid(0xf074)

        // https://fontawesome.com/icons/raspberry-pi?style=brands
        // Brands icon : RaspberryPi
        val RaspberryPi = Brand(0xf7bb)

        // https://fontawesome.com/icons/ravelry?style=brands
        // Brands icon : Ravelry
        val Ravelry = Brand(0xf2d9)

        // https://fontawesome.com/icons/react?style=brands
        // Brands icon : React
        val React = Brand(0xf41b)

        // https://fontawesome.com/icons/reacteurope?style=brands
        // Brands icon : Reacteurope
        val Reacteurope = Brand(0xf75d)

        // https://fontawesome.com/icons/readme?style=brands
        // Brands icon : Readme
        val Readme = Brand(0xf4d5)

        // https://fontawesome.com/icons/rebel?style=brands
        // Brands icon : Rebel
        val Rebel = Brand(0xf1d0)

        // https://fontawesome.com/icons/receipt?style=solid
        // Solid icon : Receipt
        val Receipt = Solid(0xf543)

        // https://fontawesome.com/icons/record-vinyl?style=solid
        // Solid icon : RecordVinyl
        val RecordVinyl = Solid(0xf8d9)

        // https://fontawesome.com/icons/recycle?style=solid
        // Solid icon : Recycle
        val Recycle = Solid(0xf1b8)

        // https://fontawesome.com/icons/red-river?style=brands
        // Brands icon : RedRiver
        val RedRiver = Brand(0xf3e3)

        // https://fontawesome.com/icons/reddit?style=brands
        // Brands icon : Reddit
        val Reddit = Brand(0xf1a1)

        // https://fontawesome.com/icons/reddit-alien?style=brands
        // Brands icon : RedditAlien
        val RedditAlien = Brand(0xf281)

        // https://fontawesome.com/icons/reddit-square?style=brands
        // Brands icon : RedditSquare
        val RedditSquare = Brand(0xf1a2)

        // https://fontawesome.com/icons/redhat?style=brands
        // Brands icon : Redhat
        val Redhat = Brand(0xf7bc)

        // https://fontawesome.com/icons/redo?style=solid
        // Solid icon : Redo
        val Redo = Solid(0xf01e)

        // https://fontawesome.com/icons/redo-alt?style=solid
        // Solid icon : RedoAlt
        val RedoAlt = Solid(0xf2f9)

        // https://fontawesome.com/icons/registered?style=solid
        // Solid icon : Registered
        val Registered = Solid(0xf25d)

        // https://fontawesome.com/icons/registered?style=regular
        // Regular icon : Registered
        val RegisteredRegular = Regular(0xf25d)

        // https://fontawesome.com/icons/remove-format?style=solid
        // Solid icon : RemoveFormat
        val RemoveFormat = Solid(0xf87d)

        // https://fontawesome.com/icons/renren?style=brands
        // Brands icon : Renren
        val Renren = Brand(0xf18b)

        // https://fontawesome.com/icons/reply?style=solid
        // Solid icon : Reply
        val Reply = Solid(0xf3e5)

        // https://fontawesome.com/icons/reply-all?style=solid
        // Solid icon : ReplyAll
        val ReplyAll = Solid(0xf122)

        // https://fontawesome.com/icons/replyd?style=brands
        // Brands icon : Replyd
        val Replyd = Brand(0xf3e6)

        // https://fontawesome.com/icons/republican?style=solid
        // Solid icon : Republican
        val Republican = Solid(0xf75e)

        // https://fontawesome.com/icons/researchgate?style=brands
        // Brands icon : Researchgate
        val Researchgate = Brand(0xf4f8)

        // https://fontawesome.com/icons/resolving?style=brands
        // Brands icon : Resolving
        val Resolving = Brand(0xf3e7)

        // https://fontawesome.com/icons/restroom?style=solid
        // Solid icon : Restroom
        val Restroom = Solid(0xf7bd)

        // https://fontawesome.com/icons/retweet?style=solid
        // Solid icon : Retweet
        val Retweet = Solid(0xf079)

        // https://fontawesome.com/icons/rev?style=brands
        // Brands icon : Rev
        val Rev = Brand(0xf5b2)

        // https://fontawesome.com/icons/ribbon?style=solid
        // Solid icon : Ribbon
        val Ribbon = Solid(0xf4d6)

        // https://fontawesome.com/icons/ring?style=solid
        // Solid icon : Ring
        val Ring = Solid(0xf70b)

        // https://fontawesome.com/icons/road?style=solid
        // Solid icon : Road
        val Road = Solid(0xf018)

        // https://fontawesome.com/icons/robot?style=solid
        // Solid icon : Robot
        val Robot = Solid(0xf544)

        // https://fontawesome.com/icons/rocket?style=solid
        // Solid icon : Rocket
        val Rocket = Solid(0xf135)

        // https://fontawesome.com/icons/rocketchat?style=brands
        // Brands icon : Rocketchat
        val Rocketchat = Brand(0xf3e8)

        // https://fontawesome.com/icons/rockrms?style=brands
        // Brands icon : Rockrms
        val Rockrms = Brand(0xf3e9)

        // https://fontawesome.com/icons/route?style=solid
        // Solid icon : Route
        val Route = Solid(0xf4d7)

        // https://fontawesome.com/icons/rss?style=solid
        // Solid icon : Rss
        val Rss = Solid(0xf09e)

        // https://fontawesome.com/icons/rss-square?style=solid
        // Solid icon : RssSquare
        val RssSquare = Solid(0xf143)

        // https://fontawesome.com/icons/ruble-sign?style=solid
        // Solid icon : RubleSign
        val RubleSign = Solid(0xf158)

        // https://fontawesome.com/icons/ruler?style=solid
        // Solid icon : Ruler
        val Ruler = Solid(0xf545)

        // https://fontawesome.com/icons/ruler-combined?style=solid
        // Solid icon : RulerCombined
        val RulerCombined = Solid(0xf546)

        // https://fontawesome.com/icons/ruler-horizontal?style=solid
        // Solid icon : RulerHorizontal
        val RulerHorizontal = Solid(0xf547)

        // https://fontawesome.com/icons/ruler-vertical?style=solid
        // Solid icon : RulerVertical
        val RulerVertical = Solid(0xf548)

        // https://fontawesome.com/icons/running?style=solid
        // Solid icon : Running
        val Running = Solid(0xf70c)

        // https://fontawesome.com/icons/rupee-sign?style=solid
        // Solid icon : RupeeSign
        val RupeeSign = Solid(0xf156)

        // https://fontawesome.com/icons/rust?style=brands
        // Brands icon : Rust
        val Rust = Brand(0xe07a)

        // https://fontawesome.com/icons/sad-cry?style=solid
        // Solid icon : SadCry
        val SadCry = Solid(0xf5b3)

        // https://fontawesome.com/icons/sad-cry?style=regular
        // Regular icon : SadCry
        val SadCryRegular = Regular(0xf5b3)

        // https://fontawesome.com/icons/sad-tear?style=solid
        // Solid icon : SadTear
        val SadTear = Solid(0xf5b4)

        // https://fontawesome.com/icons/sad-tear?style=regular
        // Regular icon : SadTear
        val SadTearRegular = Regular(0xf5b4)

        // https://fontawesome.com/icons/safari?style=brands
        // Brands icon : Safari
        val Safari = Brand(0xf267)

        // https://fontawesome.com/icons/salesforce?style=brands
        // Brands icon : Salesforce
        val Salesforce = Brand(0xf83b)

        // https://fontawesome.com/icons/sass?style=brands
        // Brands icon : Sass
        val Sass = Brand(0xf41e)

        // https://fontawesome.com/icons/satellite?style=solid
        // Solid icon : Satellite
        val Satellite = Solid(0xf7bf)

        // https://fontawesome.com/icons/satellite-dish?style=solid
        // Solid icon : SatelliteDish
        val SatelliteDish = Solid(0xf7c0)

        // https://fontawesome.com/icons/save?style=solid
        // Solid icon : Save
        val Save = Solid(0xf0c7)

        // https://fontawesome.com/icons/save?style=regular
        // Regular icon : Save
        val SaveRegular = Regular(0xf0c7)

        // https://fontawesome.com/icons/schlix?style=brands
        // Brands icon : Schlix
        val Schlix = Brand(0xf3ea)

        // https://fontawesome.com/icons/school?style=solid
        // Solid icon : School
        val School = Solid(0xf549)

        // https://fontawesome.com/icons/screwdriver?style=solid
        // Solid icon : Screwdriver
        val Screwdriver = Solid(0xf54a)

        // https://fontawesome.com/icons/scribd?style=brands
        // Brands icon : Scribd
        val Scribd = Brand(0xf28a)

        // https://fontawesome.com/icons/scroll?style=solid
        // Solid icon : Scroll
        val Scroll = Solid(0xf70e)

        // https://fontawesome.com/icons/sd-card?style=solid
        // Solid icon : SdCard
        val SdCard = Solid(0xf7c2)

        // https://fontawesome.com/icons/search?style=solid
        // Solid icon : Search
        val Search = Solid(0xf002)

        // https://fontawesome.com/icons/search-dollar?style=solid
        // Solid icon : SearchDollar
        val SearchDollar = Solid(0xf688)

        // https://fontawesome.com/icons/search-location?style=solid
        // Solid icon : SearchLocation
        val SearchLocation = Solid(0xf689)

        // https://fontawesome.com/icons/search-minus?style=solid
        // Solid icon : SearchMinus
        val SearchMinus = Solid(0xf010)

        // https://fontawesome.com/icons/search-plus?style=solid
        // Solid icon : SearchPlus
        val SearchPlus = Solid(0xf00e)

        // https://fontawesome.com/icons/searchengin?style=brands
        // Brands icon : Searchengin
        val Searchengin = Brand(0xf3eb)

        // https://fontawesome.com/icons/seedling?style=solid
        // Solid icon : Seedling
        val Seedling = Solid(0xf4d8)

        // https://fontawesome.com/icons/sellcast?style=brands
        // Brands icon : Sellcast
        val Sellcast = Brand(0xf2da)

        // https://fontawesome.com/icons/sellsy?style=brands
        // Brands icon : Sellsy
        val Sellsy = Brand(0xf213)

        // https://fontawesome.com/icons/server?style=solid
        // Solid icon : Server
        val Server = Solid(0xf233)

        // https://fontawesome.com/icons/servicestack?style=brands
        // Brands icon : Servicestack
        val Servicestack = Brand(0xf3ec)

        // https://fontawesome.com/icons/shapes?style=solid
        // Solid icon : Shapes
        val Shapes = Solid(0xf61f)

        // https://fontawesome.com/icons/share?style=solid
        // Solid icon : Share
        val Share = Solid(0xf064)

        // https://fontawesome.com/icons/share-alt?style=solid
        // Solid icon : ShareAlt
        val ShareAlt = Solid(0xf1e0)

        // https://fontawesome.com/icons/share-alt-square?style=solid
        // Solid icon : ShareAltSquare
        val ShareAltSquare = Solid(0xf1e1)

        // https://fontawesome.com/icons/share-square?style=solid
        // Solid icon : ShareSquare
        val ShareSquare = Solid(0xf14d)

        // https://fontawesome.com/icons/share-square?style=regular
        // Regular icon : ShareSquare
        val ShareSquareRegular = Regular(0xf14d)

        // https://fontawesome.com/icons/shekel-sign?style=solid
        // Solid icon : ShekelSign
        val ShekelSign = Solid(0xf20b)

        // https://fontawesome.com/icons/shield-alt?style=solid
        // Solid icon : ShieldAlt
        val ShieldAlt = Solid(0xf3ed)

        // https://fontawesome.com/icons/shield-virus?style=solid
        // Solid icon : ShieldVirus
        val ShieldVirus = Solid(0xe06c)

        // https://fontawesome.com/icons/ship?style=solid
        // Solid icon : Ship
        val Ship = Solid(0xf21a)

        // https://fontawesome.com/icons/shipping-fast?style=solid
        // Solid icon : ShippingFast
        val ShippingFast = Solid(0xf48b)

        // https://fontawesome.com/icons/shirtsinbulk?style=brands
        // Brands icon : Shirtsinbulk
        val Shirtsinbulk = Brand(0xf214)

        // https://fontawesome.com/icons/shoe-prints?style=solid
        // Solid icon : ShoePrints
        val ShoePrints = Solid(0xf54b)

        // https://fontawesome.com/icons/shopify?style=brands
        // Brands icon : Shopify
        val Shopify = Brand(0xe057)

        // https://fontawesome.com/icons/shopping-bag?style=solid
        // Solid icon : ShoppingBag
        val ShoppingBag = Solid(0xf290)

        // https://fontawesome.com/icons/shopping-basket?style=solid
        // Solid icon : ShoppingBasket
        val ShoppingBasket = Solid(0xf291)

        // https://fontawesome.com/icons/shopping-cart?style=solid
        // Solid icon : ShoppingCart
        val ShoppingCart = Solid(0xf07a)

        // https://fontawesome.com/icons/shopware?style=brands
        // Brands icon : Shopware
        val Shopware = Brand(0xf5b5)

        // https://fontawesome.com/icons/shower?style=solid
        // Solid icon : Shower
        val Shower = Solid(0xf2cc)

        // https://fontawesome.com/icons/shuttle-van?style=solid
        // Solid icon : ShuttleVan
        val ShuttleVan = Solid(0xf5b6)

        // https://fontawesome.com/icons/sign?style=solid
        // Solid icon : Sign
        val Sign = Solid(0xf4d9)

        // https://fontawesome.com/icons/sign-in-alt?style=solid
        // Solid icon : SignInAlt
        val SignInAlt = Solid(0xf2f6)

        // https://fontawesome.com/icons/sign-language?style=solid
        // Solid icon : SignLanguage
        val SignLanguage = Solid(0xf2a7)

        // https://fontawesome.com/icons/sign-out-alt?style=solid
        // Solid icon : SignOutAlt
        val SignOutAlt = Solid(0xf2f5)

        // https://fontawesome.com/icons/signal?style=solid
        // Solid icon : Signal
        val Signal = Solid(0xf012)

        // https://fontawesome.com/icons/signature?style=solid
        // Solid icon : Signature
        val Signature = Solid(0xf5b7)

        // https://fontawesome.com/icons/sim-card?style=solid
        // Solid icon : SimCard
        val SimCard = Solid(0xf7c4)

        // https://fontawesome.com/icons/simplybuilt?style=brands
        // Brands icon : Simplybuilt
        val Simplybuilt = Brand(0xf215)

        // https://fontawesome.com/icons/sink?style=solid
        // Solid icon : Sink
        val Sink = Solid(0xe06d)

        // https://fontawesome.com/icons/sistrix?style=brands
        // Brands icon : Sistrix
        val Sistrix = Brand(0xf3ee)

        // https://fontawesome.com/icons/sitemap?style=solid
        // Solid icon : Sitemap
        val Sitemap = Solid(0xf0e8)

        // https://fontawesome.com/icons/sith?style=brands
        // Brands icon : Sith
        val Sith = Brand(0xf512)

        // https://fontawesome.com/icons/skating?style=solid
        // Solid icon : Skating
        val Skating = Solid(0xf7c5)

        // https://fontawesome.com/icons/sketch?style=brands
        // Brands icon : Sketch
        val Sketch = Brand(0xf7c6)

        // https://fontawesome.com/icons/skiing?style=solid
        // Solid icon : Skiing
        val Skiing = Solid(0xf7c9)

        // https://fontawesome.com/icons/skiing-nordic?style=solid
        // Solid icon : SkiingNordic
        val SkiingNordic = Solid(0xf7ca)

        // https://fontawesome.com/icons/skull?style=solid
        // Solid icon : Skull
        val Skull = Solid(0xf54c)

        // https://fontawesome.com/icons/skull-crossbones?style=solid
        // Solid icon : SkullCrossbones
        val SkullCrossbones = Solid(0xf714)

        // https://fontawesome.com/icons/skyatlas?style=brands
        // Brands icon : Skyatlas
        val Skyatlas = Brand(0xf216)

        // https://fontawesome.com/icons/skype?style=brands
        // Brands icon : Skype
        val Skype = Brand(0xf17e)

        // https://fontawesome.com/icons/slack?style=brands
        // Brands icon : Slack
        val Slack = Brand(0xf198)

        // https://fontawesome.com/icons/slack-hash?style=brands
        // Brands icon : SlackHash
        val SlackHash = Brand(0xf3ef)

        // https://fontawesome.com/icons/slash?style=solid
        // Solid icon : Slash
        val Slash = Solid(0xf715)

        // https://fontawesome.com/icons/sleigh?style=solid
        // Solid icon : Sleigh
        val Sleigh = Solid(0xf7cc)

        // https://fontawesome.com/icons/sliders-h?style=solid
        // Solid icon : SlidersH
        val SlidersH = Solid(0xf1de)

        // https://fontawesome.com/icons/slideshare?style=brands
        // Brands icon : Slideshare
        val Slideshare = Brand(0xf1e7)

        // https://fontawesome.com/icons/smile?style=solid
        // Solid icon : Smile
        val Smile = Solid(0xf118)

        // https://fontawesome.com/icons/smile?style=regular
        // Regular icon : Smile
        val SmileRegular = Regular(0xf118)

        // https://fontawesome.com/icons/smile-beam?style=solid
        // Solid icon : SmileBeam
        val SmileBeam = Solid(0xf5b8)

        // https://fontawesome.com/icons/smile-beam?style=regular
        // Regular icon : SmileBeam
        val SmileBeamRegular = Regular(0xf5b8)

        // https://fontawesome.com/icons/smile-wink?style=solid
        // Solid icon : SmileWink
        val SmileWink = Solid(0xf4da)

        // https://fontawesome.com/icons/smile-wink?style=regular
        // Regular icon : SmileWink
        val SmileWinkRegular = Regular(0xf4da)

        // https://fontawesome.com/icons/smog?style=solid
        // Solid icon : Smog
        val Smog = Solid(0xf75f)

        // https://fontawesome.com/icons/smoking?style=solid
        // Solid icon : Smoking
        val Smoking = Solid(0xf48d)

        // https://fontawesome.com/icons/smoking-ban?style=solid
        // Solid icon : SmokingBan
        val SmokingBan = Solid(0xf54d)

        // https://fontawesome.com/icons/sms?style=solid
        // Solid icon : Sms
        val Sms = Solid(0xf7cd)

        // https://fontawesome.com/icons/snapchat?style=brands
        // Brands icon : Snapchat
        val Snapchat = Brand(0xf2ab)

        // https://fontawesome.com/icons/snapchat-ghost?style=brands
        // Brands icon : SnapchatGhost
        val SnapchatGhost = Brand(0xf2ac)

        // https://fontawesome.com/icons/snapchat-square?style=brands
        // Brands icon : SnapchatSquare
        val SnapchatSquare = Brand(0xf2ad)

        // https://fontawesome.com/icons/snowboarding?style=solid
        // Solid icon : Snowboarding
        val Snowboarding = Solid(0xf7ce)

        // https://fontawesome.com/icons/snowflake?style=solid
        // Solid icon : Snowflake
        val Snowflake = Solid(0xf2dc)

        // https://fontawesome.com/icons/snowflake?style=regular
        // Regular icon : Snowflake
        val SnowflakeRegular = Regular(0xf2dc)

        // https://fontawesome.com/icons/snowman?style=solid
        // Solid icon : Snowman
        val Snowman = Solid(0xf7d0)

        // https://fontawesome.com/icons/snowplow?style=solid
        // Solid icon : Snowplow
        val Snowplow = Solid(0xf7d2)

        // https://fontawesome.com/icons/soap?style=solid
        // Solid icon : Soap
        val Soap = Solid(0xe06e)

        // https://fontawesome.com/icons/socks?style=solid
        // Solid icon : Socks
        val Socks = Solid(0xf696)

        // https://fontawesome.com/icons/solar-panel?style=solid
        // Solid icon : SolarPanel
        val SolarPanel = Solid(0xf5ba)

        // https://fontawesome.com/icons/sort?style=solid
        // Solid icon : Sort
        val Sort = Solid(0xf0dc)

        // https://fontawesome.com/icons/sort-alpha-down?style=solid
        // Solid icon : SortAlphaDown
        val SortAlphaDown = Solid(0xf15d)

        // https://fontawesome.com/icons/sort-alpha-down-alt?style=solid
        // Solid icon : SortAlphaDownAlt
        val SortAlphaDownAlt = Solid(0xf881)

        // https://fontawesome.com/icons/sort-alpha-up?style=solid
        // Solid icon : SortAlphaUp
        val SortAlphaUp = Solid(0xf15e)

        // https://fontawesome.com/icons/sort-alpha-up-alt?style=solid
        // Solid icon : SortAlphaUpAlt
        val SortAlphaUpAlt = Solid(0xf882)

        // https://fontawesome.com/icons/sort-amount-down?style=solid
        // Solid icon : SortAmountDown
        val SortAmountDown = Solid(0xf160)

        // https://fontawesome.com/icons/sort-amount-down-alt?style=solid
        // Solid icon : SortAmountDownAlt
        val SortAmountDownAlt = Solid(0xf884)

        // https://fontawesome.com/icons/sort-amount-up?style=solid
        // Solid icon : SortAmountUp
        val SortAmountUp = Solid(0xf161)

        // https://fontawesome.com/icons/sort-amount-up-alt?style=solid
        // Solid icon : SortAmountUpAlt
        val SortAmountUpAlt = Solid(0xf885)

        // https://fontawesome.com/icons/sort-down?style=solid
        // Solid icon : SortDown
        val SortDown = Solid(0xf0dd)

        // https://fontawesome.com/icons/sort-numeric-down?style=solid
        // Solid icon : SortNumericDown
        val SortNumericDown = Solid(0xf162)

        // https://fontawesome.com/icons/sort-numeric-down-alt?style=solid
        // Solid icon : SortNumericDownAlt
        val SortNumericDownAlt = Solid(0xf886)

        // https://fontawesome.com/icons/sort-numeric-up?style=solid
        // Solid icon : SortNumericUp
        val SortNumericUp = Solid(0xf163)

        // https://fontawesome.com/icons/sort-numeric-up-alt?style=solid
        // Solid icon : SortNumericUpAlt
        val SortNumericUpAlt = Solid(0xf887)

        // https://fontawesome.com/icons/sort-up?style=solid
        // Solid icon : SortUp
        val SortUp = Solid(0xf0de)

        // https://fontawesome.com/icons/soundcloud?style=brands
        // Brands icon : Soundcloud
        val Soundcloud = Brand(0xf1be)

        // https://fontawesome.com/icons/sourcetree?style=brands
        // Brands icon : Sourcetree
        val Sourcetree = Brand(0xf7d3)

        // https://fontawesome.com/icons/spa?style=solid
        // Solid icon : Spa
        val Spa = Solid(0xf5bb)

        // https://fontawesome.com/icons/space-shuttle?style=solid
        // Solid icon : SpaceShuttle
        val SpaceShuttle = Solid(0xf197)

        // https://fontawesome.com/icons/speakap?style=brands
        // Brands icon : Speakap
        val Speakap = Brand(0xf3f3)

        // https://fontawesome.com/icons/speaker-deck?style=brands
        // Brands icon : SpeakerDeck
        val SpeakerDeck = Brand(0xf83c)

        // https://fontawesome.com/icons/spell-check?style=solid
        // Solid icon : SpellCheck
        val SpellCheck = Solid(0xf891)

        // https://fontawesome.com/icons/spider?style=solid
        // Solid icon : Spider
        val Spider = Solid(0xf717)

        // https://fontawesome.com/icons/spinner?style=solid
        // Solid icon : Spinner
        val Spinner = Solid(0xf110)

        // https://fontawesome.com/icons/splotch?style=solid
        // Solid icon : Splotch
        val Splotch = Solid(0xf5bc)

        // https://fontawesome.com/icons/spotify?style=brands
        // Brands icon : Spotify
        val Spotify = Brand(0xf1bc)

        // https://fontawesome.com/icons/spray-can?style=solid
        // Solid icon : SprayCan
        val SprayCan = Solid(0xf5bd)

        // https://fontawesome.com/icons/square?style=solid
        // Solid icon : Square
        val Square = Solid(0xf0c8)

        // https://fontawesome.com/icons/square?style=regular
        // Regular icon : Square
        val SquareRegular = Regular(0xf0c8)

        // https://fontawesome.com/icons/square-full?style=solid
        // Solid icon : SquareFull
        val SquareFull = Solid(0xf45c)

        // https://fontawesome.com/icons/square-root-alt?style=solid
        // Solid icon : SquareRootAlt
        val SquareRootAlt = Solid(0xf698)

        // https://fontawesome.com/icons/squarespace?style=brands
        // Brands icon : Squarespace
        val Squarespace = Brand(0xf5be)

        // https://fontawesome.com/icons/stack-exchange?style=brands
        // Brands icon : StackExchange
        val StackExchange = Brand(0xf18d)

        // https://fontawesome.com/icons/stack-overflow?style=brands
        // Brands icon : StackOverflow
        val StackOverflow = Brand(0xf16c)

        // https://fontawesome.com/icons/stackpath?style=brands
        // Brands icon : Stackpath
        val Stackpath = Brand(0xf842)

        // https://fontawesome.com/icons/stamp?style=solid
        // Solid icon : Stamp
        val Stamp = Solid(0xf5bf)

        // https://fontawesome.com/icons/star?style=solid
        // Solid icon : Star
        val Star = Solid(0xf005)

        // https://fontawesome.com/icons/star?style=regular
        // Regular icon : Star
        val StarRegular = Regular(0xf005)

        // https://fontawesome.com/icons/star-and-crescent?style=solid
        // Solid icon : StarAndCrescent
        val StarAndCrescent = Solid(0xf699)

        // https://fontawesome.com/icons/star-half?style=solid
        // Solid icon : StarHalf
        val StarHalf = Solid(0xf089)

        // https://fontawesome.com/icons/star-half?style=regular
        // Regular icon : StarHalf
        val StarHalfRegular = Regular(0xf089)

        // https://fontawesome.com/icons/star-half-alt?style=solid
        // Solid icon : StarHalfAlt
        val StarHalfAlt = Solid(0xf5c0)

        // https://fontawesome.com/icons/star-of-david?style=solid
        // Solid icon : StarOfDavid
        val StarOfDavid = Solid(0xf69a)

        // https://fontawesome.com/icons/star-of-life?style=solid
        // Solid icon : StarOfLife
        val StarOfLife = Solid(0xf621)

        // https://fontawesome.com/icons/staylinked?style=brands
        // Brands icon : Staylinked
        val Staylinked = Brand(0xf3f5)

        // https://fontawesome.com/icons/steam?style=brands
        // Brands icon : Steam
        val Steam = Brand(0xf1b6)

        // https://fontawesome.com/icons/steam-square?style=brands
        // Brands icon : SteamSquare
        val SteamSquare = Brand(0xf1b7)

        // https://fontawesome.com/icons/steam-symbol?style=brands
        // Brands icon : SteamSymbol
        val SteamSymbol = Brand(0xf3f6)

        // https://fontawesome.com/icons/step-backward?style=solid
        // Solid icon : StepBackward
        val StepBackward = Solid(0xf048)

        // https://fontawesome.com/icons/step-forward?style=solid
        // Solid icon : StepForward
        val StepForward = Solid(0xf051)

        // https://fontawesome.com/icons/stethoscope?style=solid
        // Solid icon : Stethoscope
        val Stethoscope = Solid(0xf0f1)

        // https://fontawesome.com/icons/sticker-mule?style=brands
        // Brands icon : StickerMule
        val StickerMule = Brand(0xf3f7)

        // https://fontawesome.com/icons/sticky-note?style=solid
        // Solid icon : StickyNote
        val StickyNote = Solid(0xf249)

        // https://fontawesome.com/icons/sticky-note?style=regular
        // Regular icon : StickyNote
        val StickyNoteRegular = Regular(0xf249)

        // https://fontawesome.com/icons/stop?style=solid
        // Solid icon : Stop
        val Stop = Solid(0xf04d)

        // https://fontawesome.com/icons/stop-circle?style=solid
        // Solid icon : StopCircle
        val StopCircle = Solid(0xf28d)

        // https://fontawesome.com/icons/stop-circle?style=regular
        // Regular icon : StopCircle
        val StopCircleRegular = Regular(0xf28d)

        // https://fontawesome.com/icons/stopwatch?style=solid
        // Solid icon : Stopwatch
        val Stopwatch = Solid(0xf2f2)

        // https://fontawesome.com/icons/stopwatch-20?style=solid
        // Solid icon : Stopwatch20
        val Stopwatch20 = Solid(0xe06f)

        // https://fontawesome.com/icons/store?style=solid
        // Solid icon : Store
        val Store = Solid(0xf54e)

        // https://fontawesome.com/icons/store-alt?style=solid
        // Solid icon : StoreAlt
        val StoreAlt = Solid(0xf54f)

        // https://fontawesome.com/icons/store-alt-slash?style=solid
        // Solid icon : StoreAltSlash
        val StoreAltSlash = Solid(0xe070)

        // https://fontawesome.com/icons/store-slash?style=solid
        // Solid icon : StoreSlash
        val StoreSlash = Solid(0xe071)

        // https://fontawesome.com/icons/strava?style=brands
        // Brands icon : Strava
        val Strava = Brand(0xf428)

        // https://fontawesome.com/icons/stream?style=solid
        // Solid icon : Stream
        val Stream = Solid(0xf550)

        // https://fontawesome.com/icons/street-view?style=solid
        // Solid icon : StreetView
        val StreetView = Solid(0xf21d)

        // https://fontawesome.com/icons/strikethrough?style=solid
        // Solid icon : Strikethrough
        val Strikethrough = Solid(0xf0cc)

        // https://fontawesome.com/icons/stripe?style=brands
        // Brands icon : Stripe
        val Stripe = Brand(0xf429)

        // https://fontawesome.com/icons/stripe-s?style=brands
        // Brands icon : StripeS
        val StripeS = Brand(0xf42a)

        // https://fontawesome.com/icons/stroopwafel?style=solid
        // Solid icon : Stroopwafel
        val Stroopwafel = Solid(0xf551)

        // https://fontawesome.com/icons/studiovinari?style=brands
        // Brands icon : Studiovinari
        val Studiovinari = Brand(0xf3f8)

        // https://fontawesome.com/icons/stumbleupon?style=brands
        // Brands icon : Stumbleupon
        val Stumbleupon = Brand(0xf1a4)

        // https://fontawesome.com/icons/stumbleupon-circle?style=brands
        // Brands icon : StumbleuponCircle
        val StumbleuponCircle = Brand(0xf1a3)

        // https://fontawesome.com/icons/subscript?style=solid
        // Solid icon : Subscript
        val Subscript = Solid(0xf12c)

        // https://fontawesome.com/icons/subway?style=solid
        // Solid icon : Subway
        val Subway = Solid(0xf239)

        // https://fontawesome.com/icons/suitcase?style=solid
        // Solid icon : Suitcase
        val Suitcase = Solid(0xf0f2)

        // https://fontawesome.com/icons/suitcase-rolling?style=solid
        // Solid icon : SuitcaseRolling
        val SuitcaseRolling = Solid(0xf5c1)

        // https://fontawesome.com/icons/sun?style=solid
        // Solid icon : Sun
        val Sun = Solid(0xf185)

        // https://fontawesome.com/icons/sun?style=regular
        // Regular icon : Sun
        val SunRegular = Regular(0xf185)

        // https://fontawesome.com/icons/superpowers?style=brands
        // Brands icon : Superpowers
        val Superpowers = Brand(0xf2dd)

        // https://fontawesome.com/icons/superscript?style=solid
        // Solid icon : Superscript
        val Superscript = Solid(0xf12b)

        // https://fontawesome.com/icons/supple?style=brands
        // Brands icon : Supple
        val Supple = Brand(0xf3f9)

        // https://fontawesome.com/icons/surprise?style=solid
        // Solid icon : Surprise
        val Surprise = Solid(0xf5c2)

        // https://fontawesome.com/icons/surprise?style=regular
        // Regular icon : Surprise
        val SurpriseRegular = Regular(0xf5c2)

        // https://fontawesome.com/icons/suse?style=brands
        // Brands icon : Suse
        val Suse = Brand(0xf7d6)

        // https://fontawesome.com/icons/swatchbook?style=solid
        // Solid icon : Swatchbook
        val Swatchbook = Solid(0xf5c3)

        // https://fontawesome.com/icons/swift?style=brands
        // Brands icon : Swift
        val Swift = Brand(0xf8e1)

        // https://fontawesome.com/icons/swimmer?style=solid
        // Solid icon : Swimmer
        val Swimmer = Solid(0xf5c4)

        // https://fontawesome.com/icons/swimming-pool?style=solid
        // Solid icon : SwimmingPool
        val SwimmingPool = Solid(0xf5c5)

        // https://fontawesome.com/icons/symfony?style=brands
        // Brands icon : Symfony
        val Symfony = Brand(0xf83d)

        // https://fontawesome.com/icons/synagogue?style=solid
        // Solid icon : Synagogue
        val Synagogue = Solid(0xf69b)

        // https://fontawesome.com/icons/sync?style=solid
        // Solid icon : Sync
        val Sync = Solid(0xf021)

        // https://fontawesome.com/icons/sync-alt?style=solid
        // Solid icon : SyncAlt
        val SyncAlt = Solid(0xf2f1)

        // https://fontawesome.com/icons/syringe?style=solid
        // Solid icon : Syringe
        val Syringe = Solid(0xf48e)

        // https://fontawesome.com/icons/table?style=solid
        // Solid icon : Table
        val Table = Solid(0xf0ce)

        // https://fontawesome.com/icons/table-tennis?style=solid
        // Solid icon : TableTennis
        val TableTennis = Solid(0xf45d)

        // https://fontawesome.com/icons/tablet?style=solid
        // Solid icon : Tablet
        val Tablet = Solid(0xf10a)

        // https://fontawesome.com/icons/tablet-alt?style=solid
        // Solid icon : TabletAlt
        val TabletAlt = Solid(0xf3fa)

        // https://fontawesome.com/icons/tablets?style=solid
        // Solid icon : Tablets
        val Tablets = Solid(0xf490)

        // https://fontawesome.com/icons/tachometer-alt?style=solid
        // Solid icon : TachometerAlt
        val TachometerAlt = Solid(0xf3fd)

        // https://fontawesome.com/icons/tag?style=solid
        // Solid icon : Tag
        val Tag = Solid(0xf02b)

        // https://fontawesome.com/icons/tags?style=solid
        // Solid icon : Tags
        val Tags = Solid(0xf02c)

        // https://fontawesome.com/icons/tape?style=solid
        // Solid icon : Tape
        val Tape = Solid(0xf4db)

        // https://fontawesome.com/icons/tasks?style=solid
        // Solid icon : Tasks
        val Tasks = Solid(0xf0ae)

        // https://fontawesome.com/icons/taxi?style=solid
        // Solid icon : Taxi
        val Taxi = Solid(0xf1ba)

        // https://fontawesome.com/icons/teamspeak?style=brands
        // Brands icon : Teamspeak
        val Teamspeak = Brand(0xf4f9)

        // https://fontawesome.com/icons/teeth?style=solid
        // Solid icon : Teeth
        val Teeth = Solid(0xf62e)

        // https://fontawesome.com/icons/teeth-open?style=solid
        // Solid icon : TeethOpen
        val TeethOpen = Solid(0xf62f)

        // https://fontawesome.com/icons/telegram?style=brands
        // Brands icon : Telegram
        val Telegram = Brand(0xf2c6)

        // https://fontawesome.com/icons/telegram-plane?style=brands
        // Brands icon : TelegramPlane
        val TelegramPlane = Brand(0xf3fe)

        // https://fontawesome.com/icons/temperature-high?style=solid
        // Solid icon : TemperatureHigh
        val TemperatureHigh = Solid(0xf769)

        // https://fontawesome.com/icons/temperature-low?style=solid
        // Solid icon : TemperatureLow
        val TemperatureLow = Solid(0xf76b)

        // https://fontawesome.com/icons/tencent-weibo?style=brands
        // Brands icon : TencentWeibo
        val TencentWeibo = Brand(0xf1d5)

        // https://fontawesome.com/icons/tenge?style=solid
        // Solid icon : Tenge
        val Tenge = Solid(0xf7d7)

        // https://fontawesome.com/icons/terminal?style=solid
        // Solid icon : Terminal
        val Terminal = Solid(0xf120)

        // https://fontawesome.com/icons/text-height?style=solid
        // Solid icon : TextHeight
        val TextHeight = Solid(0xf034)

        // https://fontawesome.com/icons/text-width?style=solid
        // Solid icon : TextWidth
        val TextWidth = Solid(0xf035)

        // https://fontawesome.com/icons/th?style=solid
        // Solid icon : Th
        val Th = Solid(0xf00a)

        // https://fontawesome.com/icons/th-large?style=solid
        // Solid icon : ThLarge
        val ThLarge = Solid(0xf009)

        // https://fontawesome.com/icons/th-list?style=solid
        // Solid icon : ThList
        val ThList = Solid(0xf00b)

        // https://fontawesome.com/icons/the-red-yeti?style=brands
        // Brands icon : TheRedYeti
        val TheRedYeti = Brand(0xf69d)

        // https://fontawesome.com/icons/theater-masks?style=solid
        // Solid icon : TheaterMasks
        val TheaterMasks = Solid(0xf630)

        // https://fontawesome.com/icons/themeco?style=brands
        // Brands icon : Themeco
        val Themeco = Brand(0xf5c6)

        // https://fontawesome.com/icons/themeisle?style=brands
        // Brands icon : Themeisle
        val Themeisle = Brand(0xf2b2)

        // https://fontawesome.com/icons/thermometer?style=solid
        // Solid icon : Thermometer
        val Thermometer = Solid(0xf491)

        // https://fontawesome.com/icons/thermometer-empty?style=solid
        // Solid icon : ThermometerEmpty
        val ThermometerEmpty = Solid(0xf2cb)

        // https://fontawesome.com/icons/thermometer-full?style=solid
        // Solid icon : ThermometerFull
        val ThermometerFull = Solid(0xf2c7)

        // https://fontawesome.com/icons/thermometer-half?style=solid
        // Solid icon : ThermometerHalf
        val ThermometerHalf = Solid(0xf2c9)

        // https://fontawesome.com/icons/thermometer-quarter?style=solid
        // Solid icon : ThermometerQuarter
        val ThermometerQuarter = Solid(0xf2ca)

        // https://fontawesome.com/icons/thermometer-three-quarters?style=solid
        // Solid icon : ThermometerThreeQuarters
        val ThermometerThreeQuarters = Solid(0xf2c8)

        // https://fontawesome.com/icons/think-peaks?style=brands
        // Brands icon : ThinkPeaks
        val ThinkPeaks = Brand(0xf731)

        // https://fontawesome.com/icons/thumbs-down?style=solid
        // Solid icon : ThumbsDown
        val ThumbsDown = Solid(0xf165)

        // https://fontawesome.com/icons/thumbs-down?style=regular
        // Regular icon : ThumbsDown
        val ThumbsDownRegular = Regular(0xf165)

        // https://fontawesome.com/icons/thumbs-up?style=solid
        // Solid icon : ThumbsUp
        val ThumbsUp = Solid(0xf164)

        // https://fontawesome.com/icons/thumbs-up?style=regular
        // Regular icon : ThumbsUp
        val ThumbsUpRegular = Regular(0xf164)

        // https://fontawesome.com/icons/thumbtack?style=solid
        // Solid icon : Thumbtack
        val Thumbtack = Solid(0xf08d)

        // https://fontawesome.com/icons/ticket-alt?style=solid
        // Solid icon : TicketAlt
        val TicketAlt = Solid(0xf3ff)

        // https://fontawesome.com/icons/tiktok?style=brands
        // Brands icon : Tiktok
        val Tiktok = Brand(0xe07b)

        // https://fontawesome.com/icons/times?style=solid
        // Solid icon : Times
        val Times = Solid(0xf00d)

        // https://fontawesome.com/icons/times-circle?style=solid
        // Solid icon : TimesCircle
        val TimesCircle = Solid(0xf057)

        // https://fontawesome.com/icons/times-circle?style=regular
        // Regular icon : TimesCircle
        val TimesCircleRegular = Regular(0xf057)

        // https://fontawesome.com/icons/tint?style=solid
        // Solid icon : Tint
        val Tint = Solid(0xf043)

        // https://fontawesome.com/icons/tint-slash?style=solid
        // Solid icon : TintSlash
        val TintSlash = Solid(0xf5c7)

        // https://fontawesome.com/icons/tired?style=solid
        // Solid icon : Tired
        val Tired = Solid(0xf5c8)

        // https://fontawesome.com/icons/tired?style=regular
        // Regular icon : Tired
        val TiredRegular = Regular(0xf5c8)

        // https://fontawesome.com/icons/toggle-off?style=solid
        // Solid icon : ToggleOff
        val ToggleOff = Solid(0xf204)

        // https://fontawesome.com/icons/toggle-on?style=solid
        // Solid icon : ToggleOn
        val ToggleOn = Solid(0xf205)

        // https://fontawesome.com/icons/toilet?style=solid
        // Solid icon : Toilet
        val Toilet = Solid(0xf7d8)

        // https://fontawesome.com/icons/toilet-paper?style=solid
        // Solid icon : ToiletPaper
        val ToiletPaper = Solid(0xf71e)

        // https://fontawesome.com/icons/toilet-paper-slash?style=solid
        // Solid icon : ToiletPaperSlash
        val ToiletPaperSlash = Solid(0xe072)

        // https://fontawesome.com/icons/toolbox?style=solid
        // Solid icon : Toolbox
        val Toolbox = Solid(0xf552)

        // https://fontawesome.com/icons/tools?style=solid
        // Solid icon : Tools
        val Tools = Solid(0xf7d9)

        // https://fontawesome.com/icons/tooth?style=solid
        // Solid icon : Tooth
        val Tooth = Solid(0xf5c9)

        // https://fontawesome.com/icons/torah?style=solid
        // Solid icon : Torah
        val Torah = Solid(0xf6a0)

        // https://fontawesome.com/icons/torii-gate?style=solid
        // Solid icon : ToriiGate
        val ToriiGate = Solid(0xf6a1)

        // https://fontawesome.com/icons/tractor?style=solid
        // Solid icon : Tractor
        val Tractor = Solid(0xf722)

        // https://fontawesome.com/icons/trade-federation?style=brands
        // Brands icon : TradeFederation
        val TradeFederation = Brand(0xf513)

        // https://fontawesome.com/icons/trademark?style=solid
        // Solid icon : Trademark
        val Trademark = Solid(0xf25c)

        // https://fontawesome.com/icons/traffic-light?style=solid
        // Solid icon : TrafficLight
        val TrafficLight = Solid(0xf637)

        // https://fontawesome.com/icons/trailer?style=solid
        // Solid icon : Trailer
        val Trailer = Solid(0xe041)

        // https://fontawesome.com/icons/train?style=solid
        // Solid icon : Train
        val Train = Solid(0xf238)

        // https://fontawesome.com/icons/tram?style=solid
        // Solid icon : Tram
        val Tram = Solid(0xf7da)

        // https://fontawesome.com/icons/transgender?style=solid
        // Solid icon : Transgender
        val Transgender = Solid(0xf224)

        // https://fontawesome.com/icons/transgender-alt?style=solid
        // Solid icon : TransgenderAlt
        val TransgenderAlt = Solid(0xf225)

        // https://fontawesome.com/icons/trash?style=solid
        // Solid icon : Trash
        val Trash = Solid(0xf1f8)

        // https://fontawesome.com/icons/trash-alt?style=solid
        // Solid icon : TrashAlt
        val TrashAlt = Solid(0xf2ed)

        // https://fontawesome.com/icons/trash-alt?style=regular
        // Regular icon : TrashAlt
        val TrashAltRegular = Regular(0xf2ed)

        // https://fontawesome.com/icons/trash-restore?style=solid
        // Solid icon : TrashRestore
        val TrashRestore = Solid(0xf829)

        // https://fontawesome.com/icons/trash-restore-alt?style=solid
        // Solid icon : TrashRestoreAlt
        val TrashRestoreAlt = Solid(0xf82a)

        // https://fontawesome.com/icons/tree?style=solid
        // Solid icon : Tree
        val Tree = Solid(0xf1bb)

        // https://fontawesome.com/icons/trello?style=brands
        // Brands icon : Trello
        val Trello = Brand(0xf181)

        // https://fontawesome.com/icons/tripadvisor?style=brands
        // Brands icon : Tripadvisor
        val Tripadvisor = Brand(0xf262)

        // https://fontawesome.com/icons/trophy?style=solid
        // Solid icon : Trophy
        val Trophy = Solid(0xf091)

        // https://fontawesome.com/icons/truck?style=solid
        // Solid icon : Truck
        val Truck = Solid(0xf0d1)

        // https://fontawesome.com/icons/truck-loading?style=solid
        // Solid icon : TruckLoading
        val TruckLoading = Solid(0xf4de)

        // https://fontawesome.com/icons/truck-monster?style=solid
        // Solid icon : TruckMonster
        val TruckMonster = Solid(0xf63b)

        // https://fontawesome.com/icons/truck-moving?style=solid
        // Solid icon : TruckMoving
        val TruckMoving = Solid(0xf4df)

        // https://fontawesome.com/icons/truck-pickup?style=solid
        // Solid icon : TruckPickup
        val TruckPickup = Solid(0xf63c)

        // https://fontawesome.com/icons/tshirt?style=solid
        // Solid icon : Tshirt
        val Tshirt = Solid(0xf553)

        // https://fontawesome.com/icons/tty?style=solid
        // Solid icon : Tty
        val Tty = Solid(0xf1e4)

        // https://fontawesome.com/icons/tumblr?style=brands
        // Brands icon : Tumblr
        val Tumblr = Brand(0xf173)

        // https://fontawesome.com/icons/tumblr-square?style=brands
        // Brands icon : TumblrSquare
        val TumblrSquare = Brand(0xf174)

        // https://fontawesome.com/icons/tv?style=solid
        // Solid icon : Tv
        val Tv = Solid(0xf26c)

        // https://fontawesome.com/icons/twitch?style=brands
        // Brands icon : Twitch
        val Twitch = Brand(0xf1e8)

        // https://fontawesome.com/icons/twitter?style=brands
        // Brands icon : Twitter
        val Twitter = Brand(0xf099)

        // https://fontawesome.com/icons/twitter-square?style=brands
        // Brands icon : TwitterSquare
        val TwitterSquare = Brand(0xf081)

        // https://fontawesome.com/icons/typo3?style=brands
        // Brands icon : Typo3
        val Typo3 = Brand(0xf42b)

        // https://fontawesome.com/icons/uber?style=brands
        // Brands icon : Uber
        val Uber = Brand(0xf402)

        // https://fontawesome.com/icons/ubuntu?style=brands
        // Brands icon : Ubuntu
        val Ubuntu = Brand(0xf7df)

        // https://fontawesome.com/icons/uikit?style=brands
        // Brands icon : Uikit
        val Uikit = Brand(0xf403)

        // https://fontawesome.com/icons/umbraco?style=brands
        // Brands icon : Umbraco
        val Umbraco = Brand(0xf8e8)

        // https://fontawesome.com/icons/umbrella?style=solid
        // Solid icon : Umbrella
        val Umbrella = Solid(0xf0e9)

        // https://fontawesome.com/icons/umbrella-beach?style=solid
        // Solid icon : UmbrellaBeach
        val UmbrellaBeach = Solid(0xf5ca)

        // https://fontawesome.com/icons/uncharted?style=brands
        // Brands icon : Uncharted
        val Uncharted = Brand(0xe084)

        // https://fontawesome.com/icons/underline?style=solid
        // Solid icon : Underline
        val Underline = Solid(0xf0cd)

        // https://fontawesome.com/icons/undo?style=solid
        // Solid icon : Undo
        val Undo = Solid(0xf0e2)

        // https://fontawesome.com/icons/undo-alt?style=solid
        // Solid icon : UndoAlt
        val UndoAlt = Solid(0xf2ea)

        // https://fontawesome.com/icons/uniregistry?style=brands
        // Brands icon : Uniregistry
        val Uniregistry = Brand(0xf404)

        // https://fontawesome.com/icons/unity?style=brands
        // Brands icon : Unity
        val Unity = Brand(0xe049)

        // https://fontawesome.com/icons/universal-access?style=solid
        // Solid icon : UniversalAccess
        val UniversalAccess = Solid(0xf29a)

        // https://fontawesome.com/icons/university?style=solid
        // Solid icon : University
        val University = Solid(0xf19c)

        // https://fontawesome.com/icons/unlink?style=solid
        // Solid icon : Unlink
        val Unlink = Solid(0xf127)

        // https://fontawesome.com/icons/unlock?style=solid
        // Solid icon : Unlock
        val Unlock = Solid(0xf09c)

        // https://fontawesome.com/icons/unlock-alt?style=solid
        // Solid icon : UnlockAlt
        val UnlockAlt = Solid(0xf13e)

        // https://fontawesome.com/icons/unsplash?style=brands
        // Brands icon : Unsplash
        val Unsplash = Brand(0xe07c)

        // https://fontawesome.com/icons/untappd?style=brands
        // Brands icon : Untappd
        val Untappd = Brand(0xf405)

        // https://fontawesome.com/icons/upload?style=solid
        // Solid icon : Upload
        val Upload = Solid(0xf093)

        // https://fontawesome.com/icons/ups?style=brands
        // Brands icon : Ups
        val Ups = Brand(0xf7e0)

        // https://fontawesome.com/icons/usb?style=brands
        // Brands icon : Usb
        val Usb = Brand(0xf287)

        // https://fontawesome.com/icons/user?style=solid
        // Solid icon : User
        val User = Solid(0xf007)

        // https://fontawesome.com/icons/user?style=regular
        // Regular icon : User
        val UserRegular = Regular(0xf007)

        // https://fontawesome.com/icons/user-alt?style=solid
        // Solid icon : UserAlt
        val UserAlt = Solid(0xf406)

        // https://fontawesome.com/icons/user-alt-slash?style=solid
        // Solid icon : UserAltSlash
        val UserAltSlash = Solid(0xf4fa)

        // https://fontawesome.com/icons/user-astronaut?style=solid
        // Solid icon : UserAstronaut
        val UserAstronaut = Solid(0xf4fb)

        // https://fontawesome.com/icons/user-check?style=solid
        // Solid icon : UserCheck
        val UserCheck = Solid(0xf4fc)

        // https://fontawesome.com/icons/user-circle?style=solid
        // Solid icon : UserCircle
        val UserCircle = Solid(0xf2bd)

        // https://fontawesome.com/icons/user-circle?style=regular
        // Regular icon : UserCircle
        val UserCircleRegular = Regular(0xf2bd)

        // https://fontawesome.com/icons/user-clock?style=solid
        // Solid icon : UserClock
        val UserClock = Solid(0xf4fd)

        // https://fontawesome.com/icons/user-cog?style=solid
        // Solid icon : UserCog
        val UserCog = Solid(0xf4fe)

        // https://fontawesome.com/icons/user-edit?style=solid
        // Solid icon : UserEdit
        val UserEdit = Solid(0xf4ff)

        // https://fontawesome.com/icons/user-friends?style=solid
        // Solid icon : UserFriends
        val UserFriends = Solid(0xf500)

        // https://fontawesome.com/icons/user-graduate?style=solid
        // Solid icon : UserGraduate
        val UserGraduate = Solid(0xf501)

        // https://fontawesome.com/icons/user-injured?style=solid
        // Solid icon : UserInjured
        val UserInjured = Solid(0xf728)

        // https://fontawesome.com/icons/user-lock?style=solid
        // Solid icon : UserLock
        val UserLock = Solid(0xf502)

        // https://fontawesome.com/icons/user-md?style=solid
        // Solid icon : UserMd
        val UserMd = Solid(0xf0f0)

        // https://fontawesome.com/icons/user-minus?style=solid
        // Solid icon : UserMinus
        val UserMinus = Solid(0xf503)

        // https://fontawesome.com/icons/user-ninja?style=solid
        // Solid icon : UserNinja
        val UserNinja = Solid(0xf504)

        // https://fontawesome.com/icons/user-nurse?style=solid
        // Solid icon : UserNurse
        val UserNurse = Solid(0xf82f)

        // https://fontawesome.com/icons/user-plus?style=solid
        // Solid icon : UserPlus
        val UserPlus = Solid(0xf234)

        // https://fontawesome.com/icons/user-secret?style=solid
        // Solid icon : UserSecret
        val UserSecret = Solid(0xf21b)

        // https://fontawesome.com/icons/user-shield?style=solid
        // Solid icon : UserShield
        val UserShield = Solid(0xf505)

        // https://fontawesome.com/icons/user-slash?style=solid
        // Solid icon : UserSlash
        val UserSlash = Solid(0xf506)

        // https://fontawesome.com/icons/user-tag?style=solid
        // Solid icon : UserTag
        val UserTag = Solid(0xf507)

        // https://fontawesome.com/icons/user-tie?style=solid
        // Solid icon : UserTie
        val UserTie = Solid(0xf508)

        // https://fontawesome.com/icons/user-times?style=solid
        // Solid icon : UserTimes
        val UserTimes = Solid(0xf235)

        // https://fontawesome.com/icons/users?style=solid
        // Solid icon : Users
        val Users = Solid(0xf0c0)

        // https://fontawesome.com/icons/users-cog?style=solid
        // Solid icon : UsersCog
        val UsersCog = Solid(0xf509)

        // https://fontawesome.com/icons/users-slash?style=solid
        // Solid icon : UsersSlash
        val UsersSlash = Solid(0xe073)

        // https://fontawesome.com/icons/usps?style=brands
        // Brands icon : Usps
        val Usps = Brand(0xf7e1)

        // https://fontawesome.com/icons/ussunnah?style=brands
        // Brands icon : Ussunnah
        val Ussunnah = Brand(0xf407)

        // https://fontawesome.com/icons/utensil-spoon?style=solid
        // Solid icon : UtensilSpoon
        val UtensilSpoon = Solid(0xf2e5)

        // https://fontawesome.com/icons/utensils?style=solid
        // Solid icon : Utensils
        val Utensils = Solid(0xf2e7)

        // https://fontawesome.com/icons/vaadin?style=brands
        // Brands icon : Vaadin
        val Vaadin = Brand(0xf408)

        // https://fontawesome.com/icons/vector-square?style=solid
        // Solid icon : VectorSquare
        val VectorSquare = Solid(0xf5cb)

        // https://fontawesome.com/icons/venus?style=solid
        // Solid icon : Venus
        val Venus = Solid(0xf221)

        // https://fontawesome.com/icons/venus-double?style=solid
        // Solid icon : VenusDouble
        val VenusDouble = Solid(0xf226)

        // https://fontawesome.com/icons/venus-mars?style=solid
        // Solid icon : VenusMars
        val VenusMars = Solid(0xf228)

        // https://fontawesome.com/icons/vest?style=solid
        // Solid icon : Vest
        val Vest = Solid(0xe085)

        // https://fontawesome.com/icons/vest-patches?style=solid
        // Solid icon : VestPatches
        val VestPatches = Solid(0xe086)

        // https://fontawesome.com/icons/viacoin?style=brands
        // Brands icon : Viacoin
        val Viacoin = Brand(0xf237)

        // https://fontawesome.com/icons/viadeo?style=brands
        // Brands icon : Viadeo
        val Viadeo = Brand(0xf2a9)

        // https://fontawesome.com/icons/viadeo-square?style=brands
        // Brands icon : ViadeoSquare
        val ViadeoSquare = Brand(0xf2aa)

        // https://fontawesome.com/icons/vial?style=solid
        // Solid icon : Vial
        val Vial = Solid(0xf492)

        // https://fontawesome.com/icons/vials?style=solid
        // Solid icon : Vials
        val Vials = Solid(0xf493)

        // https://fontawesome.com/icons/viber?style=brands
        // Brands icon : Viber
        val Viber = Brand(0xf409)

        // https://fontawesome.com/icons/video?style=solid
        // Solid icon : Video
        val Video = Solid(0xf03d)

        // https://fontawesome.com/icons/video-slash?style=solid
        // Solid icon : VideoSlash
        val VideoSlash = Solid(0xf4e2)

        // https://fontawesome.com/icons/vihara?style=solid
        // Solid icon : Vihara
        val Vihara = Solid(0xf6a7)

        // https://fontawesome.com/icons/vimeo?style=brands
        // Brands icon : Vimeo
        val Vimeo = Brand(0xf40a)

        // https://fontawesome.com/icons/vimeo-square?style=brands
        // Brands icon : VimeoSquare
        val VimeoSquare = Brand(0xf194)

        // https://fontawesome.com/icons/vimeo-v?style=brands
        // Brands icon : VimeoV
        val VimeoV = Brand(0xf27d)

        // https://fontawesome.com/icons/vine?style=brands
        // Brands icon : Vine
        val Vine = Brand(0xf1ca)

        // https://fontawesome.com/icons/virus?style=solid
        // Solid icon : Virus
        val Virus = Solid(0xe074)

        // https://fontawesome.com/icons/virus-slash?style=solid
        // Solid icon : VirusSlash
        val VirusSlash = Solid(0xe075)

        // https://fontawesome.com/icons/viruses?style=solid
        // Solid icon : Viruses
        val Viruses = Solid(0xe076)

        // https://fontawesome.com/icons/vk?style=brands
        // Brands icon : Vk
        val Vk = Brand(0xf189)

        // https://fontawesome.com/icons/vnv?style=brands
        // Brands icon : Vnv
        val Vnv = Brand(0xf40b)

        // https://fontawesome.com/icons/voicemail?style=solid
        // Solid icon : Voicemail
        val Voicemail = Solid(0xf897)

        // https://fontawesome.com/icons/volleyball-ball?style=solid
        // Solid icon : VolleyballBall
        val VolleyballBall = Solid(0xf45f)

        // https://fontawesome.com/icons/volume-down?style=solid
        // Solid icon : VolumeDown
        val VolumeDown = Solid(0xf027)

        // https://fontawesome.com/icons/volume-mute?style=solid
        // Solid icon : VolumeMute
        val VolumeMute = Solid(0xf6a9)

        // https://fontawesome.com/icons/volume-off?style=solid
        // Solid icon : VolumeOff
        val VolumeOff = Solid(0xf026)

        // https://fontawesome.com/icons/volume-up?style=solid
        // Solid icon : VolumeUp
        val VolumeUp = Solid(0xf028)

        // https://fontawesome.com/icons/vote-yea?style=solid
        // Solid icon : VoteYea
        val VoteYea = Solid(0xf772)

        // https://fontawesome.com/icons/vr-cardboard?style=solid
        // Solid icon : VrCardboard
        val VrCardboard = Solid(0xf729)

        // https://fontawesome.com/icons/vuejs?style=brands
        // Brands icon : Vuejs
        val Vuejs = Brand(0xf41f)

        // https://fontawesome.com/icons/walking?style=solid
        // Solid icon : Walking
        val Walking = Solid(0xf554)

        // https://fontawesome.com/icons/wallet?style=solid
        // Solid icon : Wallet
        val Wallet = Solid(0xf555)

        // https://fontawesome.com/icons/warehouse?style=solid
        // Solid icon : Warehouse
        val Warehouse = Solid(0xf494)

        // https://fontawesome.com/icons/watchman-monitoring?style=brands
        // Brands icon : WatchmanMonitoring
        val WatchmanMonitoring = Brand(0xe087)

        // https://fontawesome.com/icons/water?style=solid
        // Solid icon : Water
        val Water = Solid(0xf773)

        // https://fontawesome.com/icons/wave-square?style=solid
        // Solid icon : WaveSquare
        val WaveSquare = Solid(0xf83e)

        // https://fontawesome.com/icons/waze?style=brands
        // Brands icon : Waze
        val Waze = Brand(0xf83f)

        // https://fontawesome.com/icons/weebly?style=brands
        // Brands icon : Weebly
        val Weebly = Brand(0xf5cc)

        // https://fontawesome.com/icons/weibo?style=brands
        // Brands icon : Weibo
        val Weibo = Brand(0xf18a)

        // https://fontawesome.com/icons/weight?style=solid
        // Solid icon : Weight
        val Weight = Solid(0xf496)

        // https://fontawesome.com/icons/weight-hanging?style=solid
        // Solid icon : WeightHanging
        val WeightHanging = Solid(0xf5cd)

        // https://fontawesome.com/icons/weixin?style=brands
        // Brands icon : Weixin
        val Weixin = Brand(0xf1d7)

        // https://fontawesome.com/icons/whatsapp?style=brands
        // Brands icon : Whatsapp
        val Whatsapp = Brand(0xf232)

        // https://fontawesome.com/icons/whatsapp-square?style=brands
        // Brands icon : WhatsappSquare
        val WhatsappSquare = Brand(0xf40c)

        // https://fontawesome.com/icons/wheelchair?style=solid
        // Solid icon : Wheelchair
        val Wheelchair = Solid(0xf193)

        // https://fontawesome.com/icons/whmcs?style=brands
        // Brands icon : Whmcs
        val Whmcs = Brand(0xf40d)

        // https://fontawesome.com/icons/wifi?style=solid
        // Solid icon : Wifi
        val Wifi = Solid(0xf1eb)

        // https://fontawesome.com/icons/wikipedia-w?style=brands
        // Brands icon : WikipediaW
        val WikipediaW = Brand(0xf266)

        // https://fontawesome.com/icons/wind?style=solid
        // Solid icon : Wind
        val Wind = Solid(0xf72e)

        // https://fontawesome.com/icons/window-close?style=solid
        // Solid icon : WindowClose
        val WindowClose = Solid(0xf410)

        // https://fontawesome.com/icons/window-close?style=regular
        // Regular icon : WindowClose
        val WindowCloseRegular = Regular(0xf410)

        // https://fontawesome.com/icons/window-maximize?style=solid
        // Solid icon : WindowMaximize
        val WindowMaximize = Solid(0xf2d0)

        // https://fontawesome.com/icons/window-maximize?style=regular
        // Regular icon : WindowMaximize
        val WindowMaximizeRegular = Regular(0xf2d0)

        // https://fontawesome.com/icons/window-minimize?style=solid
        // Solid icon : WindowMinimize
        val WindowMinimize = Solid(0xf2d1)

        // https://fontawesome.com/icons/window-minimize?style=regular
        // Regular icon : WindowMinimize
        val WindowMinimizeRegular = Regular(0xf2d1)

        // https://fontawesome.com/icons/window-restore?style=solid
        // Solid icon : WindowRestore
        val WindowRestore = Solid(0xf2d2)

        // https://fontawesome.com/icons/window-restore?style=regular
        // Regular icon : WindowRestore
        val WindowRestoreRegular = Regular(0xf2d2)

        // https://fontawesome.com/icons/windows?style=brands
        // Brands icon : Windows
        val Windows = Brand(0xf17a)

        // https://fontawesome.com/icons/wine-bottle?style=solid
        // Solid icon : WineBottle
        val WineBottle = Solid(0xf72f)

        // https://fontawesome.com/icons/wine-glass?style=solid
        // Solid icon : WineGlass
        val WineGlass = Solid(0xf4e3)

        // https://fontawesome.com/icons/wine-glass-alt?style=solid
        // Solid icon : WineGlassAlt
        val WineGlassAlt = Solid(0xf5ce)

        // https://fontawesome.com/icons/wix?style=brands
        // Brands icon : Wix
        val Wix = Brand(0xf5cf)

        // https://fontawesome.com/icons/wizards-of-the-coast?style=brands
        // Brands icon : WizardsOfTheCoast
        val WizardsOfTheCoast = Brand(0xf730)

        // https://fontawesome.com/icons/wodu?style=brands
        // Brands icon : Wodu
        val Wodu = Brand(0xe088)

        // https://fontawesome.com/icons/wolf-pack-battalion?style=brands
        // Brands icon : WolfPackBattalion
        val WolfPackBattalion = Brand(0xf514)

        // https://fontawesome.com/icons/won-sign?style=solid
        // Solid icon : WonSign
        val WonSign = Solid(0xf159)

        // https://fontawesome.com/icons/wordpress?style=brands
        // Brands icon : Wordpress
        val Wordpress = Brand(0xf19a)

        // https://fontawesome.com/icons/wordpress-simple?style=brands
        // Brands icon : WordpressSimple
        val WordpressSimple = Brand(0xf411)

        // https://fontawesome.com/icons/wpbeginner?style=brands
        // Brands icon : Wpbeginner
        val Wpbeginner = Brand(0xf297)

        // https://fontawesome.com/icons/wpexplorer?style=brands
        // Brands icon : Wpexplorer
        val Wpexplorer = Brand(0xf2de)

        // https://fontawesome.com/icons/wpforms?style=brands
        // Brands icon : Wpforms
        val Wpforms = Brand(0xf298)

        // https://fontawesome.com/icons/wpressr?style=brands
        // Brands icon : Wpressr
        val Wpressr = Brand(0xf3e4)

        // https://fontawesome.com/icons/wrench?style=solid
        // Solid icon : Wrench
        val Wrench = Solid(0xf0ad)

        // https://fontawesome.com/icons/x-ray?style=solid
        // Solid icon : XRay
        val XRay = Solid(0xf497)

        // https://fontawesome.com/icons/xbox?style=brands
        // Brands icon : Xbox
        val Xbox = Brand(0xf412)

        // https://fontawesome.com/icons/xing?style=brands
        // Brands icon : Xing
        val Xing = Brand(0xf168)

        // https://fontawesome.com/icons/xing-square?style=brands
        // Brands icon : XingSquare
        val XingSquare = Brand(0xf169)

        // https://fontawesome.com/icons/y-combinator?style=brands
        // Brands icon : YCombinator
        val YCombinator = Brand(0xf23b)

        // https://fontawesome.com/icons/yahoo?style=brands
        // Brands icon : Yahoo
        val Yahoo = Brand(0xf19e)

        // https://fontawesome.com/icons/yammer?style=brands
        // Brands icon : Yammer
        val Yammer = Brand(0xf840)

        // https://fontawesome.com/icons/yandex?style=brands
        // Brands icon : Yandex
        val Yandex = Brand(0xf413)

        // https://fontawesome.com/icons/yandex-international?style=brands
        // Brands icon : YandexInternational
        val YandexInternational = Brand(0xf414)

        // https://fontawesome.com/icons/yarn?style=brands
        // Brands icon : Yarn
        val Yarn = Brand(0xf7e3)

        // https://fontawesome.com/icons/yelp?style=brands
        // Brands icon : Yelp
        val Yelp = Brand(0xf1e9)

        // https://fontawesome.com/icons/yen-sign?style=solid
        // Solid icon : YenSign
        val YenSign = Solid(0xf157)

        // https://fontawesome.com/icons/yin-yang?style=solid
        // Solid icon : YinYang
        val YinYang = Solid(0xf6ad)

        // https://fontawesome.com/icons/yoast?style=brands
        // Brands icon : Yoast
        val Yoast = Brand(0xf2b1)

        // https://fontawesome.com/icons/youtube?style=brands
        // Brands icon : Youtube
        val Youtube = Brand(0xf167)

        // https://fontawesome.com/icons/youtube-square?style=brands
        // Brands icon : YoutubeSquare
        val YoutubeSquare = Brand(0xf431)

        // https://fontawesome.com/icons/zhihu?style=brands
        // Brands icon : Zhihu
        val Zhihu = Brand(0xf63f)
    }
}