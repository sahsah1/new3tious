CREATE TABLE user (
  id UUID NOT NULL PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  favoriteIngredients VARCHAR(200),
  allergies VARCHAR(100),
  onDiet BIT
);