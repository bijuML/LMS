import { Book } from "./Book";
export interface Library {
    id: number;
    libraryName: string;
    librarianName: string;
    libraryPhone: string;
    books: Book[];
}