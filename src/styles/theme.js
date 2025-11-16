// UI / UX 가이드에 따른 스타일 정의 
const theme = {};

theme.PALLETE = {
    primary: {
        main: "#0051FF",
        dark: "#0033A3",
        light1: "#3182F6",
        light0: "#CCDCFF",
    },
    secondary: {
        main: "#F83BAA",
        dark: "#FF8AC1",
        light: "#FFACD3",
    },
    grey: {
        greyScale0: "#F9F9F9",
        greyScale1: "#E0E0E0",
        greyScale2: "#BDBDBD",
        greyScale3: "#9E9E9E",
        greyScale4: "#757575",
    },
    rank : {
        rookie: "#00C853",
        silver: "#B0BEC5",
        gold: "#DAB24C", 
        diamond: "#00E5FF",
        master: "#FF1744",

    },
    basic: "#111111",
    success: "#00B45A",
    warning: "#FF1B1F",
    review: "#FFCA0A",
    error: "", // 없음
    white: "#fff",
    background: {
        white: "",//없음
        gray: "" //없음
    }
}

theme.FONT_SIZE = {
    headerLogo: "42px",
    headerSubLogo: "28px",
    h1: "110px",
    h2: "62px",
    h3: "46px",
    h4: "40px",
    h5: "32px",
    h6: "24px",
    accent: "36px",
    title: "26px",
    paragraph: "22px",
    subtitle: "18px",
    smallText3: "16px",
    smallText2: "14px",
    smallText1: "12px",
    smallText0: "10px",
    miniText: "6px"
}

theme.FONT_WEIGHT = {
    thin: "100",
    light: "300",
    regular: "400",
    medium: "500",
    bold: "700",
    extraBold: "800",
} 

theme.FONT_LINE = {
    h1: "75px",
    h2: "55px",
    h3: "41px",
    h4: "29px",
    h5: "25px",
    h6: "22px",
    h7: "17px",
}

export default theme;
