import styled from "styled-components";

export const Grid = styled.div`
  width: 100%;
  display: flex;
  flex-wrap: wrap;
  justify-content: flex-start;
  gap: clamp(16px, 5vw, 85px);
`;
