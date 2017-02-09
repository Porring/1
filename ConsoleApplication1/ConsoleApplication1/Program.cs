using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Collections;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            int n=0,n1=0,a=2;
            String str1, str2, str3, ch;
            Dictionary<int, String> dicC = new Dictionary<int, String>();
            Dictionary<int, String> dicP = new Dictionary<int, String>();
            while (a > 1)
            {
                a++;
                str1 = str2 = str3 = "";
                ch = "";
                Console.WriteLine("What to add? Category - 1, Post - 2,Show category - 3, Show post - 4, exit - 0");
                ch = Console.ReadLine();
                switch (ch)
                {
                    case "1":
                        {
                            Console.WriteLine("Enter the name of category.");
                            str1 = Console.ReadLine();
                            if (!dicC.ContainsValue(str1)) { n++; dicC.Add(n, str1); } else { Console.WriteLine("Error! Such a category already exists!"); }                                                       
                            break;
                        }
                    case "2":
                        {
                            Console.WriteLine("Enter the name of post.");
                            str2 = Console.ReadLine();
                            if (!dicP.ContainsValue(str2)) { n1++; dicP.Add(n1, str2); } else { Console.WriteLine("Error! Such a post already exists!"); }                          
                            break;
                        }
                    case "3":
                        {
                            foreach (KeyValuePair<int, string> keyValue in dicC)
                            {
                                Console.WriteLine(keyValue.Key + " - " + keyValue.Value);
                            }
                            break;
                        }
                    case "4":
                        {
                            foreach (KeyValuePair<int, string> keyValue in dicP)
                            {
                                Console.WriteLine(keyValue.Key + " - " + keyValue.Value);
                            }
                            break;
                        }
                    default:
                        {
                            a = 0;
                            break;
                        }                      
                }
                Console.ReadKey();
                Console.Clear();
            }
        }
    }
}
